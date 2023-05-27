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
    private JLabel lbTitulo;
    private JLabel lbAutor;
    private JLabel lbEdicion;
    private JLabel lbNombreColeccion;
    private JLabel lbNumeroColeccion;
    private JTextField tfTitulo;
    private JTextField tfAutor;
    private JTextField tfEdicion;
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

        lbTitulo = new JLabel("Título:", JLabel.RIGHT);
        lbTitulo.setBounds(0,50,150,25);
        lbTitulo.setFont(fontLabel);
        lbTitulo.setForeground(Color.WHITE);
        this.add(lbTitulo);

        tfTitulo = new JTextField();
        tfTitulo.setBounds(160,50,60,20);
        tfTitulo.setFont(fontField);
        tfTitulo.setBorder(null);
        tfTitulo.setForeground(Color.WHITE);
        tfTitulo.setCaretColor(Color.WHITE);
        tfTitulo.setBackground(new Color(59,59,59));
        this.add(tfTitulo);

        lbAutor = new JLabel("Autor:", JLabel.RIGHT);
        lbAutor.setBounds(0,90,150,25);
        lbAutor.setFont(fontLabel);
        lbAutor.setForeground(Color.WHITE);
        this.add(lbAutor);

        tfAutor = new JTextField();
        tfAutor.setBounds(160,90,60,20);
        tfAutor.setFont(fontField);
        tfAutor.setBorder(null);
        tfAutor.setForeground(Color.WHITE);
        tfAutor.setCaretColor(Color.WHITE);
        tfAutor.setBackground(new Color(59,59,59));
        this.add(tfAutor);

        lbEdicion = new JLabel("Edición:", JLabel.RIGHT);
        lbEdicion.setBounds(0,130,150,25);
        lbEdicion.setFont(fontLabel);
        lbEdicion.setForeground(Color.WHITE);
        this.add(lbEdicion);

        tfEdicion = new JTextField();
        tfEdicion.setBounds(160,130,60,20);
        tfEdicion.setFont(fontField);
        tfEdicion.setBorder(null);
        tfEdicion.setForeground(Color.WHITE);
        tfEdicion.setCaretColor(Color.WHITE);
        tfEdicion.setBackground(new Color(59,59,59));
        this.add(tfEdicion);

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
