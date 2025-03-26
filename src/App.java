import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        int[] listado = {10, 21, 5, 8, -1, 0};
        int opcion;  
        
        Scanner leer = new Scanner(System.in);

        System.out.print("Elige una opción:");

        System.out.println();

        System.out.println("1. Metodo Seleccion \n2. Metodo Burbuja \n3. Metodo Insercion");

        opcion = leer.nextInt();
        
        
        if (opcion == 1) {
            System.out.println(" Método Selección");

            MetodoSeleccion mS = new MetodoSeleccion();

            System.out.println("Arreglo original:");
            mS.printArray(listado);


            mS.ordenar(listado, true);
            System.out.println("Arreglo ordenado ascendente:");
            mS.printArray(listado);

        
            mS.ordenar(listado, false);
            System.out.println("Arreglo ordenado descendente:");
            mS.printArray(listado);
        } 

        else if (opcion == 2) {
            System.out.println("Método Burbuja");

            MetodoBurbuja mB = new MetodoBurbuja();


            System.out.println("Arreglo original:");
            for (int i = 0; i < listado.length; i++) {
                System.out.print(listado[i] + " ");
            }
            System.out.println();


            mB.ordenar(listado, true);
            mB.imprimirArreglo(listado, true);

        
            mB.ordenar(listado, false);
            mB.imprimirArreglo(listado, false);
        }

        else if (opcion == 3) {
            MetodoInsercion metodo = new MetodoInsercion();                
            
            System.out.println("Arreglo original");
            metodo.imprimirArreglo(listado);
            metodo.ordenar(listado, true);
            System.out.println("Arreglo ordenado sin pasos");
            metodo.imprimirArreglo(listado);
            metodo.ordenar(listado, false);
            System.out.println("Arreglo ordenado con pasos");
            metodo.imprimirArreglo(listado);
        }

        else {
            System.out.println("Opción no válida");
        }
        

        leer.close();
    }
}