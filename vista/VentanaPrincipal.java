package vista;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaPrincipal extends JFrame
{
    //
    // Atributos
    //
    
    private JPanel colorFondo;
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultados;
    public DialogoAgregarLibro miDialogoAgregarLibro;

    //
    // Métodos
    //
    
    // Constructor
    public VentanaPrincipal()
    {
        this.setLayout(null);
        
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,340,230);
        this.add(miPanelEntradaDatos);
        
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,250,560,100);
        this.add(miPanelOperaciones);
        
        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(360,10,210,230);
        this.add(miPanelResultados);
        miDialogoAgregarLibro = null;
        
        this.setTitle("Biblioteca del señor Pérez");
        this.setSize(600,400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        
        colorFondo = new JPanel();
        colorFondo.setBackground(new Color(24, 24, 24));
        colorFondo.setBounds(0,0,600,400);
        this.add(colorFondo);
    }

    public void crearDialogoAgregarLibro()
    {
        miDialogoAgregarLibro = new DialogoAgregarLibro();
    }
}
