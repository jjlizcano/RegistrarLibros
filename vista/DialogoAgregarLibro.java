package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DialogoAgregarLibro extends JDialog
{
    //
    // Atributos
    //

    private JPanel colorFondo;
    private JLabel lbTituloDialogo;
    private JLabel lbTitulo;
    private JLabel lbAutor;
    private JLabel lbEdicion;
    private JTextField tfTitulo;
    private JTextField tfAutor;
    private JTextField tfEdicion;
    private String nombreColeccion;
    private int numeroColeccion;
    private JButton btAceptar;

    private Font fontLabel = new Font("Arial", Font.BOLD, 20);
    private Font fontField = new Font("Arial", Font.BOLD, 15);

    //
    // Métodos
    //

    // Constructor
    public DialogoAgregarLibro()
    {
        this.setLayout(null);

        lbTituloDialogo = new JLabel("Agregar Libro", JLabel.CENTER);
        lbTituloDialogo.setBounds(0,10,340,20);
        lbTituloDialogo.setFont(fontLabel);
        lbTituloDialogo.setForeground(Color.WHITE);
        this.add(lbTitulo);

        lbTitulo = new JLabel("Título:", JLabel.RIGHT);
        lbTitulo.setBounds(0,50,150,20);
        lbTitulo.setFont(fontLabel);
        lbTitulo.setForeground(Color.WHITE);
        this.add(lbTitulo);

        tfTitulo = new JTextField();
        tfTitulo.setBounds(160,50,60,25);
        tfTitulo.setFont(fontField);
        tfTitulo.setBorder(null);
        tfTitulo.setForeground(Color.WHITE);
        tfTitulo.setCaretColor(Color.WHITE);
        tfTitulo.setBackground(new Color(59,59,59));
        this.add(tfTitulo);

        lbAutor = new JLabel("Autor:", JLabel.RIGHT);
        lbAutor.setBounds(0,90,150,20);
        lbAutor.setFont(fontLabel);
        lbAutor.setForeground(Color.WHITE);
        this.add(lbAutor);

        tfAutor = new JTextField();
        tfAutor.setBounds(160,90,60,25);
        tfAutor.setFont(fontField);
        tfAutor.setBorder(null);
        tfAutor.setForeground(Color.WHITE);
        tfAutor.setCaretColor(Color.WHITE);
        tfAutor.setBackground(new Color(59,59,59));
        this.add(tfAutor);

        lbEdicion = new JLabel("Edición:", JLabel.RIGHT);
        lbEdicion.setBounds(0,130,150,20);
        lbEdicion.setFont(fontLabel);
        lbEdicion.setForeground(Color.WHITE);
        this.add(lbEdicion);

        tfEdicion = new JTextField();
        tfEdicion.setBounds(160,130,60,25);
        tfEdicion.setFont(fontField);
        tfEdicion.setBorder(null);
        tfEdicion.setForeground(Color.WHITE);
        tfEdicion.setCaretColor(Color.WHITE);
        tfEdicion.setBackground(new Color(59,59,59));
        this.add(tfEdicion);

        btAceptar = new JButton("Aceptar");
        btAceptar.setBounds(40,170,260,26);

        this.setTitle("Carro");
        this.setSize(340,230);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);

        colorFondo = new JPanel();
        colorFondo.setBackground(new Color(31,31,31));
        colorFondo.setBounds(0,0,600,400);
        this.add(colorFondo);
    }
}
