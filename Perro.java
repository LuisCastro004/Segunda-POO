package exa3_4;

/**
 *
 * @author estef
 */
import java.util.Scanner;
public class Perro extends Animal implements Acciones_basicas
{
    private double velocidad;
    private String descripcion;
     Scanner perrp = new Scanner(System.in);

    public Perro()
    {
    }

    public Perro(double velocidad, String descripcion)
    {
        this.velocidad = velocidad;
        this.descripcion = descripcion;
    }

    public void setVelocidad(double velocidad)
    {
        this.velocidad = velocidad;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

    public void setTamaño(double tamaño)
    {
        this.tamaño = tamaño;
    }
 //___________________________________________________________________________
     public String colorAnimal(String color) {
        System.out.println("¿Cuál es el color de su perro?");
        color = perro.nextLine();
        System.out.println("El color de su perro es: " + color);
        return color;
    }

    public int tamañoAnimal(int tamaño) {
        System.out.println("¿Cuál es el tamaño de su perro en cm?");
        tamaño = perro.nextInt();
        perros.nextLine(); // Limpiar el buffer
        System.out.println("Su perro mide: " + tamaño + " cm");
        return tamaño;
    }
    public String ZonaAnimal(String zona) {
        System.out.println("¿De dónde viene su perro?");
        zona = perros.next

    //_____________________________________________________________

    public void calculaVelocidadP( double tiempo) {
       
        double distancia = 5.0; // distancia en km
        System.out.println("Que tarda en recorrer 5km este perro?");
        System.out.println("El tiempo que le tomo al perro llegar fue de: "+tiempo);
        
        velocidad = distancia / tiempo;

        System.out.println("El ave vuela a una velocidad de: " + velocidad+ " km/h");
}}
