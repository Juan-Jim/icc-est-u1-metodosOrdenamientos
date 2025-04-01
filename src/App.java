import java.util.Arrays;
import java.util.Scanner;

public class App {
    private static final int[] arregloOriginal = {12, -7, 25, 0, -15, 33, 19, -22, 5, 48, -3, 27, -30, 14, 7, -1, 41, 20, -11, 8};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nSeleccione el método de ordenamiento:");
            System.out.println("1. Burbuja");
            System.out.println("2. Selección");
            System.out.println("3. Inserción");
            System.out.println("4. Burbuja Mejorado");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            
            int opcion;
            try {
                opcion = Integer.parseInt(scanner.nextLine());
                if (opcion < 1 || opcion > 5) {
                    System.out.println("Error: Ingrese un número entre 1 y 5");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número válido");
                continue;
            }
            
            if (opcion == 5) {
                System.out.println("Saliendo del programa...");
                break;
            }
            
            System.out.print("¿Desea ver los pasos? (true/false): ");
            boolean mostrarPasos;
            try {
                mostrarPasos = Boolean.parseBoolean(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Error: Ingrese true o false");
                continue;
            }
            
            System.out.print("¿Desea ordenar ascendentemente (A) o descendentemente (D)?: ");
            String orden = scanner.nextLine().toUpperCase();
            if (!orden.equals("A") && !orden.equals("D")) {
                System.out.println("Error: Ingrese A para ascendente o D para descendente");
                continue;
            }
            
            int[] arregloCopia = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
            System.out.println("\nArreglo original: " + Arrays.toString(arregloOriginal));
            
            int[] resultado = new int[2];
            String nombreMetodo = "";
            
            switch (opcion) {
                case 1:
                    resultado = MetodoBurbuja.ordenar(arregloCopia, orden.equals("A"), mostrarPasos);
                    nombreMetodo = "BURBUJA";
                    break;
                case 2:
                    resultado = MetodoSeleccion.ordenar(arregloCopia, orden.equals("A"), mostrarPasos);
                    nombreMetodo = "SELECCIÓN";
                    break;
                case 3:
                    resultado = MetodoInsercion.ordenar(arregloCopia, orden.equals("A"), mostrarPasos);
                    nombreMetodo = "INSERCIÓN";
                    break;
                case 4:
                    resultado = MetodoBurbujaAvanzado.ordenar(arregloCopia, orden.equals("A"), mostrarPasos);
                    nombreMetodo = "BURBUJA MEJORADO";
                    break;
            }
            
            System.out.println("\nFIN DEL MÉTODO " + nombreMetodo );
            System.out.println("Arreglo ordenado: " + Arrays.toString(arregloCopia));
            System.out.println("Comparaciones totales: " + resultado[0]);
            System.out.println("Cambios totales: " + resultado[1]);
        }
        
        scanner.close();
    }
}