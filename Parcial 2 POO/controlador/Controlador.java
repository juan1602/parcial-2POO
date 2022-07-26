package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VentanaPrincipal;
import modelo.Figura;

public class Controlador implements ActionListener
{
        //------------
        // Atributos
        //------------
    
        private VentanaPrincipal vista;
        private Figura modelo;
    
        //------------
        // Metodos
        //------------
    
        //metodo constructor
        public Controlador(VentanaPrincipal pVista, Figura pModelo)
        {
            this.vista = pVista;
            this.modelo= pModelo;
            this.vista.miPanelOperaciones.btHallar.addActionListener(this);
            this.vista.miPanelOperaciones.btBorrar.addActionListener(this);
            this.vista.miPanelOperaciones.btSalir.addActionListener(this);      
        }
        @Override
        public void actionPerformed(ActionEvent ae) 
        {
            // Identificar el comando generado [hallar,borrar, salir]
            String comando = ae.getActionCommand();
            
            if(comando.equals("Salir"))
            {
                System.exit(0);
            }
            
            if(comando.equals("Borrar"))
            {
                this.vista.miPanelEntradaDatos.borrar();
                this.vista.miPanelResultados.borrar();
            }
    
            if(comando.equals("Hallar"))
            {
                /*modelo.setRadio(Long.parseLong(vista.miPanelEntradaDatos.getTfx()));
                modelo.setOperador(vista.miPanelEntradaDatos.getOperador());
                modelo.setAltura(Integer.parseInt(vista.miPanelEntradaDatos.getTfy()));
                modelo.setAristas(Integer.parseInt(vista.miPanelEntradaDatos.getTfz()));
                modelo.calcularPlan();
                
                vista.miPanelResultados.mostrarResultado(modelo);*/
                
    
            }
        }
}
