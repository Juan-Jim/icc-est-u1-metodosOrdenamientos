import java.util.Arrays;

public class MetodoBurbuja {
    public static int[] ordenar(int[] arr, boolean ascendente, boolean mostrarPasos) {
        int comparaciones = 0;
        int cambios = 0;
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                comparaciones++;
                boolean condicion = ascendente ? arr[j] > arr[j + 1] : arr[j] < arr[j + 1];
                
                if (mostrarPasos) {
                    System.out.println();
                    System.out.printf("Comparación %d: %d %s %d%n", 
                            comparaciones, arr[j], ascendente ? ">" : "<", arr[j + 1]);
                }
                
                if (condicion) {
                    cambios++;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                    if (mostrarPasos) {
                        System.out.printf("Intercambio: %d <-> %d%n", arr[j + 1], arr[j]);
                        System.out.println("Estado actual: " + Arrays.toString(arr));
                    }
                } else if (mostrarPasos) {
                    System.out.println("(No hay intercambio)");
                    System.out.println("Estado actual: " + Arrays.toString(arr));
                }
            }
        }
        
        return new int[]{comparaciones, cambios};
    }
}