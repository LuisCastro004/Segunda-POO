package exa3_4;

/**
 *
 * @author estef
 */
import java.util.Scanner;

public class Ave extends Animal implements Acciones_basicas
{
    private double velocidad_en_vuelo;
    private String descripcion;
    Scanner aves = new Scanner(System.in);

    public Ave()
    {
    }

    public Ave(double velocidad_en_vuelo, String descripcion)
    {
        this.velocidad_en_vuelo = velocidad_en_vuelo;
        this.descripcion = descripcion;
    }

    public double getVelocidad_en_vuelo()
    {
        return velocidad_en_vuelo;
    }

    public void setVelocidad_en_vuelo(double velocidad_en_vuelo)
    {
        this.velocidad_en_vuelo = velocidad_en_vuelo;
    }

    public String getDescripcion()
    {
        return descripcion;
    }
    
//_______________________________________________________________________________
   public String colorAnimal(String color)
   {
       System.out.println("Cual es el color de su ave? ");
        color = aves.nextLine();
        System.out.println("El color de su ave es: " + color);
        return color;
   }
   
   public int tamañoAnimal(int tamaño)
   {
         System.out.println("Cual es el tamaño de su ave en cm? ");
        tamaño = aves.nextInt();
        aves.nextLine(); // Limpiar el buffer
        System.out.println("Su ave mide: " + tamaño + " cm");
        return tamaño;
   }

    @Override
    public String ZonaAnimal(String zona)
    {
        System.out.println("De donde viene su ave? ");
        zona = aves.nextLine();
        System.out.println("Su ave es de: " + zona);
        return zona;
    }
    @Override
    public int años(int edad)
    {
        System.out.println("Cuantos años tiene su ave?");
        edad = aves.nextInt();
        aves.nextLine(); 
        System.out.println("Su ave tiene " + edad + " años");
        return edad;
    }
   
   //________________________________________________
    
   public void calculaVelocidad( double tiempo) {
       
        double distancia = 5.0; // distancia en km
        System.out.println("Que velocidad recorre la ave 5 km?");
        System.out.println("El tiempo que le tomo a la ave fue de: "+tiempo);
        
        velocidad_en_vuelo = distancia / tiempo;

        System.out.println("El ave vuela a una velocidad de: " + velocidad_en_vuelo + " km/h");
   }

    @Override
    String colorAnimal()
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    int tamañoAnimal()
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
   

    }

