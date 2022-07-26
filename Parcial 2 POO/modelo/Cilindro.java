package modelo;

public class Cilindro extends Figura
{
    //Atributos
    private double altura;
    private double radio;
    
    //CONSTRUCTOR
    public Cilindro(double altura, double radio)
    {
        this.setAltura(altura);
        this.setRadio(radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void calcularVolumen()
    {
        volumen= Math.PI*altura*(radio*radio);
    }
}
