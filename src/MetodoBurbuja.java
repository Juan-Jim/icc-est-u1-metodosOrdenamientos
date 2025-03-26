public class MetodoBurbuja {

    public void ordenar(int[] array, boolean conditional) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                
                if (conditional) {
                    if (array[j] > array[j + 1]) {
                        int aux = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = aux;
                    }
                } else {
                    if (array[j] < array[j + 1]) {
                        int aux = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = aux;
                    }
                }
            }
        }
    }

    
    public void imprimirArreglo(int[] array, boolean conditional) {

        if (conditional) {
            System.out.println("Arreglo ordenado de menor a mayor: ");
        } else {
            System.out.println("Arreglo ordenado de mayor a menor: ");
        }


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}