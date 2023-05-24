package vista;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelOperaciones extends JPanel
{
    //
    // Atributos
    //

    public JButton btRegistrar;
    public JButton btInformacion;


    //
    // Métodos
    //

    // Constructor
    public PanelOperaciones()
    {
        this.setLayout(null);
        this.setBackground(new Color(31,31,31));
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        btRegistrar.addActionListener(pAL);
        btInformacion.addActionListener(pAL);
    }
}
