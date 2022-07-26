package modelo;

public class Esfera extends Figura
{
    //Atributos
    private double radio;
    
    public Esfera(double radio)
    {
        this.setRadio(radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void calcularVolumen()
    {
        volumen = (1.3333333)*Math.PI*(radio*radio*radio);
    }
}
