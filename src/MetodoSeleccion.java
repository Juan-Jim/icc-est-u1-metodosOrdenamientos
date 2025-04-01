import java.util.Arrays;

public class MetodoSeleccion {
    public static int[] ordenar(int[] arr, boolean ascendente, boolean mostrarPasos) {
        int comparaciones = 0;
        int cambios = 0;
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            int posicion = i;
            
            for (int j = i + 1; j < n; j++) {
                comparaciones++;
                boolean condicion = ascendente ? arr[j] < arr[posicion] : arr[j] > arr[posicion];
                
                if (mostrarPasos) {
                    System.out.printf("Comparación %d: %d %s %d%n", 
                            comparaciones, arr[j], ascendente ? "<" : ">", arr[posicion]);
                }
                
                if (condicion) {
                    posicion = j;
                    
                    if (mostrarPasos) {
                        System.out.printf("Nuevo mínimo/máximo encontrado en posición %d: %d%n", 
                                posicion, arr[posicion]);
                    }
                } else if (mostrarPasos) {
                    System.out.println("(No es el nuevo mínimo/máximo)");
                }
            }
            
            if (posicion != i) {
                cambios++;
                int temp = arr[i];
                arr[i] = arr[posicion];
                arr[posicion] = temp;
                
                if (mostrarPasos) {
                    System.out.printf("Intercambio: %d <-> %d%n", arr[i], arr[posicion]);
                    System.out.println("Estado actual: " + Arrays.toString(arr));
                }
            }
        }
        
        return new int[]{comparaciones, cambios};
    }
}