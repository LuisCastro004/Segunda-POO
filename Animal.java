
package exam3_4;


public abstract class Animal {
    //Sandra____23280670
   
    private String Nombre;
    private int Edad;
    private double Peso;
    
   
    public Animal(String nombre, int edad, double peso) {
        this.Nombre = nombre;
        this.Edad = edad;
        this.Peso = peso;
    }

   
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        this.Edad = edad;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        this.Peso = peso;
    }

    public abstract String hacerSonido();
    public abstract boolean esDomestico();
    
  

public interface ACCIONES_BASICAS {
    
    boolean moverse(int distanciaEnMetros);
    String comer(int cantidadDeComidaEnGramos);
    
}

}

   
  


  