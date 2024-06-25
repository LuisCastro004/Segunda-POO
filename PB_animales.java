package exa3_4;

import java.util.Scanner;

/**
 *
 * @author estef
 */
public class PB_animales
{

    public static void main(String[] args)
    {
        
        Scanner seleccion = new Scanner (System.in);
        Ave objAves = new Ave();
        Perro objPerro = new Perro();
        int opcion;

        do {
            System.out.println("Con que desea trabajar?: ");
            System.out.println("1.- Aves");
            System.out.println("2.- Perros");
            System.out.println("3.- Salir del sistema");
            System.out.print("Seleccione una opcion: ");
            
            while (!seleccion.hasNextInt()) {
                System.out.println("Por favor, ingrese un numero valido.");
                seleccion.next(); // Limpiar la entrada incorrecta
                System.out.print("Seleccione una opción: ");
            }
            
            opcion = seleccion.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Trabajando con Aves.");
                    
                    System.out.println("Ah seleccionado aves!!");
                    objAves.ZonaAnimal(" ");
                    objAves.años(0);
                    objAves.colorAnimal(" ");
                    objAves.tamañoAnimal(0);
                    objAves.calculaVelocidad(31.12);
                    
                    break;
                case 2:
                 
                    System.out.println("Ah seleccionado Perros!!");
                    objPerro.ZonaAnimal(" ");
                    objPerro.años(0);
                    objPerro.colorAnimal(" ");
                    objPerro.tamañoAnimal(0);
                    objPerro.calculaVelocidadP(21213.3);
                    
                    break;
                case 3:
                    System.out.println("Saliendo del sistema.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    break;
            }
        } while (opcion != 3);

        seleccion.close();
        
    }

}
