
package exam3_4;

import java.util.Scanner;

public class Menu_principal {

    
    public static void main(String[] args) {
  
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione una opciOn:");
            System.out.println("1. Crear Ave");
            System.out.println("2. Crear Perro");
            System.out.println("3. Salir del sistema");
            System.out.print("OpciOn: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    crearAve(scanner);
                    break;
                case 2:
                    crearPerro(scanner);
                    break;
                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opcion valida.");
            }
        } while (opcion != 3);

        scanner.close();
    }

    private static void crearAve(Scanner scanner) {

          Ave miAve = new Ave("Loro", 3, 1.5, 60.0, "Un loro colorido y parlante");

        System.out.println("Nombre: " + miAve.getNombre());
        System.out.println("Edad: " + miAve.getEdad());
        System.out.println("Peso: " + miAve.getPeso());
        System.out.println("Velocidad en vuelo: " + miAve.getVelocidadEnVuelo() + " km/h");
        System.out.println("Descripción: " + miAve.getDescripcion());
        
        
    }

    private static void crearPerro(Scanner scanner) {

      Perro miPerro = new Perro("Firulais", 5, 20.0, "Juan");

        System.out.println("Nombre: " + miPerro.getNombre());
        System.out.println("Edad: " + miPerro.getEdad());
        System.out.println("Peso: " + miPerro.getPeso());
        System.out.println("Dueño: " + miPerro.getDueno());

 
        System.out.println(miPerro.hacerSonido());
        System.out.println("¿Es doméstico?: " + miPerro.esDomestico());
        System.out.println("Movimiento: " + (miPerro.moverse(500) ? "Exitoso" : "Fallido"));
        System.out.println(miPerro.comer(200));
    }

     
}



                                             