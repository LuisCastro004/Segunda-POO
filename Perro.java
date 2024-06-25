
package exam3_4;

import exam3_4.Animal.ACCIONES_BASICAS;


public class Perro extends Animal implements ACCIONES_BASICAS {

    
    private String dueno;

   
    public Perro(String nombre, int edad, double peso, String dueno) {
        super(nombre, edad, peso);
        this.dueno = dueno;
    }

   
    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    
    @Override
    public String hacerSonido() {
        return "El perro ladra: Guau, guau";
    }

    @Override
    public boolean esDomestico() {
        return true; 
    }

    
    @Override
    public boolean moverse(int distanciaEnMetros) {
        
        return true; 
    }

    @Override
    public String comer(int cantidadDeComidaEnGramos) {
        return "El perro ha comido " + cantidadDeComidaEnGramos + " gramos de comida.";
    }

   
}
