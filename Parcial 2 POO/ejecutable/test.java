package ejecutable;

import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VentanaPrincipal;
import modelo.Cilindro;
import modelo.Cono;
import modelo.Cubo;
import modelo.Esfera;

public class test 
{
       public static void main(String[] args)
    {
        
        double radio= Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de radio: "));
        double aristas= Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de las aristas: "));
        double altura= Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de altura: "));

        Esfera miEsfera= new Esfera(radio);
        miEsfera.calcularVolumen();
        JOptionPane.showMessageDialog(null, "El volumen de la esfera es " + miEsfera.getVolumen());

        Cono miCono= new Cono(altura, radio);
        miCono.calcularVolumen();
        JOptionPane.showMessageDialog(null, "El volumen del cono es " + miCono.getVolumen());

        Cubo miCubo= new Cubo(aristas);
        miCubo.calcularVolumen();
        JOptionPane.showMessageDialog(null, "El volumen del cubo es " + miCubo.getVolumen());

        Cilindro miCilindro= new Cilindro(altura, radio);
        miCilindro.calcularVolumen();
        JOptionPane.showMessageDialog(null, "El volumen del cilindro es " + miCilindro.getVolumen());
        /*VentanaPrincipal miVentana= new VentanaPrincipal();
        Plan miModelo = new Plan(0, 0, 0, "");  
        Controlador miControlador = new Controlador(miVentana,miModelo);*/
    }
}
