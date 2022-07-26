package modelo;

public class Cubo extends Figura
{
    //Atributos
    private double aristas;

    public Cubo(double aristas)
    {
        this.setAristas(aristas);
    }

    public double getAristas() {
        return aristas;
    }

    public void setAristas(double aristas) {
        this.aristas = aristas;
    }
    public void calcularVolumen()
    {
        volumen = (aristas*aristas*aristas);
    }
}
