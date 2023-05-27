package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Biblioteca;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener
{
    //
    // Atributos
    //

    private VentanaPrincipal venPrin;
    private Biblioteca model;
    
    //
    // Métodos
    //

    // Método constructor
    public Controlador(VentanaPrincipal pVenPrin, Biblioteca pBiblioteca)
    {
        this.venPrin = pVenPrin;
        this.model = pBiblioteca;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        this.venPrin.miPanelResultados.mostrarResultado("Bienvenido a la\nbiblioteca del señor Pérez");
    }
    
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        String comando = ae.getActionCommand();

        if(comando.equals("registrar"))
        {
            System.out.println("Error");
            venPrin.crearDialogoRegistrar();
            System.out.println("Error");
            venPrin.miDialogoRegistrarLibro.agregarOyentesBotones(this);
        }
    }
    
}