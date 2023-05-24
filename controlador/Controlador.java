package controlador;

import modelo.Biblioteca;

import vista.VentanaPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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
    }
    
    @Override
    public void actionPerformed(ActionEvent ae)
    {

    }
    
}