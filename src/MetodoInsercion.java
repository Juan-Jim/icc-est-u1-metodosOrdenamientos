import java.util.Arrays;

public class MetodoInsercion {
    public static int[] ordenar(int[] arr, boolean ascendente, boolean mostrarPasos) {
        int comparaciones = 0;
        int cambios = 0;
        int n = arr.length;
        
        for (int i = 1; i < n; i++) {
            int valorActual = arr[i];
            int j = i - 1;
            
            while (j >= 0) {
                comparaciones++;
                boolean condicion = ascendente ? arr[j] > valorActual : arr[j] < valorActual;
                
                if (mostrarPasos) {
                    System.out.printf("Comparación %d: %d %s %d%n", 
                            comparaciones, arr[j], ascendente ? ">" : "<", valorActual);
                }
                
                if (condicion) {
                    cambios++;
                    arr[j + 1] = arr[j];
                    
                    if (mostrarPasos) {
                        System.out.printf("Desplazamiento: %d -> posición %d%n", 
                                arr[j], j + 1);
                        System.out.println("Estado actual: " + Arrays.toString(arr));
                    }
                    
                    j--;
                } else {
                    if (mostrarPasos) {
                        System.out.println("(No hay desplazamiento)");
                    }
                    break;
                }
            }
            
            if (j + 1 != i) {
                arr[j + 1] = valorActual;
                
                if (mostrarPasos) {
                    System.out.printf("Insertando %d en posición %d%n", 
                            valorActual, j + 1);
                    System.out.println("Estado actual: " + Arrays.toString(arr));
                }
            }
        }
        
        return new int[]{comparaciones, cambios};
    }
}
