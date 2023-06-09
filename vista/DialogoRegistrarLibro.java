package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DialogoRegistrarLibro extends JDialog
{
    //
    // Atributos
    //

    private JPanel colorFondo;
    private JLabel lbTituloDialogo;
    private JLabel lbNombreColeccion;
    private JLabel lbNumeroColeccion;
    private JTextField tfNombreColeccion;
    private JTextField tfNumeroColeccion;
    private JButton btAceptar;

    private Font fontLabel = new Font("Arial", Font.BOLD, 20);
    private Font fontField = new Font("Arial", Font.BOLD, 15);

    //
    // Métodos
    //

    // Constructor
    public DialogoRegistrarLibro()
    {
        this.setLayout(null);

        // Creación y adición de elementos
        lbTituloDialogo = new JLabel("Agregar Libro", JLabel.CENTER);
        lbTituloDialogo.setBounds(0,10,340,25);
        lbTituloDialogo.setFont(fontLabel);
        lbTituloDialogo.setForeground(Color.WHITE);
        this.add(lbTituloDialogo);

        lbNombreColeccion = new JLabel("Nombre Colección:", JLabel.RIGHT);
        lbNombreColeccion.setBounds(0,170,200,25);
        lbNombreColeccion.setFont(fontLabel);
        lbNombreColeccion.setForeground(Color.WHITE);
        this.add(lbNombreColeccion);

        tfNombreColeccion = new JTextField();
        tfNombreColeccion.setBounds(210,170,60,20);
        tfNombreColeccion.setFont(fontField);
        tfNombreColeccion.setBorder(null);
        tfNombreColeccion.setForeground(Color.WHITE);
        tfNombreColeccion.setCaretColor(Color.WHITE);
        tfNombreColeccion.setBackground(new Color(59,59,59));
        this.add(tfNombreColeccion);

        lbNumeroColeccion = new JLabel("Número Colección:", JLabel.RIGHT);
        lbNumeroColeccion.setBounds(0,210,200,25);
        lbNumeroColeccion.setFont(fontLabel);
        lbNumeroColeccion.setForeground(Color.WHITE);
        this.add(lbNumeroColeccion);

        tfNumeroColeccion = new JTextField();
        tfNumeroColeccion.setBounds(210,210,60,20);
        tfNumeroColeccion.setFont(fontField);
        tfNumeroColeccion.setBorder(null);
        tfNumeroColeccion.setForeground(Color.WHITE);
        tfNumeroColeccion.setCaretColor(Color.WHITE);
        tfNumeroColeccion.setBackground(new Color(59,59,59));
        this.add(tfNumeroColeccion);

        btAceptar = new JButton("Aceptar");
        btAceptar.setBounds(40,260,260,20);
        btAceptar.setFont(fontField);
        btAceptar.setActionCommand("aceptar");
        btAceptar.setForeground(Color.WHITE);
        btAceptar.setBackground(new Color(59,59,59));
        this.add(btAceptar);

        // Características de la ventana
        this.setTitle("Registrar Libro");
        this.setSize(340,340);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);

        colorFondo = new JPanel();
        colorFondo.setBackground(new Color(31,31,31));
        colorFondo.setBounds(0,0,340,340);
        this.add(colorFondo);
    }

    public String getNombreColeccion()
    {
        return tfNombreColeccion.getText();
    }

    public int getNumeroColeccion()
    {
        return Integer.parseInt(tfNumeroColeccion.getText());
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        btAceptar.addActionListener(pAL);
    }

    public void cerrarDialogo()
    {
        this.dispose();
    }
}
