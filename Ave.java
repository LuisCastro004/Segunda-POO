
package exam3_4;

import exam3_4.Animal.ACCIONES_BASICAS;

public class Ave extends Animal implements ACCIONES_BASICAS {

   
    private double velocidadEnVuelo; 
    private String descripcion;

 
    public Ave(String nombre, int edad, double peso, double velocidadEnVuelo, String descripcion) {
        super(nombre, edad, peso);
        this.velocidadEnVuelo = velocidadEnVuelo;
        this.descripcion = descripcion;
    }

    
    public double getVelocidadEnVuelo() {
        return velocidadEnVuelo;
    }

    public void setVelocidadEnVuelo(double velocidadEnVuelo) {
        this.velocidadEnVuelo = velocidadEnVuelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

   
    @Override
    public String hacerSonido() {
        return "El ave hace un sonido relajante.";
    }

    @Override
    public boolean esDomestico() {
        return false; 
    }

    
    @Override
    public boolean moverse(int distanciaEnMetros) {
        return true; 
    }

    @Override
    public String comer(int cantidadDeComidaEnGramos) {
        return "El ave ha comido " + cantidadDeComidaEnGramos + " gramos de comida.";
    }

    public double calcularTiempoVuelo(double distanciaEnKilometros) {
        return distanciaEnKilometros / this.velocidadEnVuelo; 
    }

 
}


    
    
   
  
