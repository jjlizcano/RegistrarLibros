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

        btRegistrar = new JButton("Registrar");
        btRegistrar.setBounds(100,40,120,20);
        btRegistrar.setForeground(Color.WHITE);
        btRegistrar.setBackground(new Color(59,59,59));
        this.add(btRegistrar);
        btRegistrar.setActionCommand("registrar");

        btInformacion = new JButton("Información");
        btInformacion.setBounds(300,40,120,20);
        btInformacion.setForeground(Color.WHITE);
        btInformacion.setBackground(new Color(59,59,59));
        this.add(btInformacion);
        btInformacion.setActionCommand("informacion");
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        btRegistrar.addActionListener(pAL);
        btInformacion.addActionListener(pAL);
    }
}
