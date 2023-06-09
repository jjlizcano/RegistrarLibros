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
    public JButton btSalir;

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
        btRegistrar.setActionCommand("registrar");
        this.add(btRegistrar);

        btInformacion = new JButton("Consultar");
        btInformacion.setBounds(300,40,120,20);
        btInformacion.setForeground(Color.WHITE);
        btInformacion.setBackground(new Color(59,59,59));
        btInformacion.setActionCommand("consultar");
        this.add(btInformacion);

        btSalir = new JButton("Salir");
        btSalir.setBounds(200,70,120,20);
        btSalir.setForeground(Color.WHITE);
        btSalir.setBackground(new Color(59,59,59));
        btSalir.setActionCommand("salir");
        this.add(btSalir);
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        btRegistrar.addActionListener(pAL);
        btInformacion.addActionListener(pAL);
        btSalir.addActionListener(pAL);
    }
}
