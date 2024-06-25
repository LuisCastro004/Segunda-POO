package exa3_4;

/**
 *
 * @author estef
 */
abstract class Animal
{
    private int edad;
    double tamaño;
    private String color;

    public Animal()
    {
    }

    public Animal(int edad, double tamaño, String color)
    {
        this.edad = edad;
        this.tamaño = tamaño;
        this.color = color;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    public double getTamaño()
    {
        return tamaño;
    }

    public void setTamaño(double tamaño)
    {
        this.tamaño = tamaño;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    //_________________________________________________--

   abstract String colorAnimal();
   
   abstract int tamañoAnimal();
}
