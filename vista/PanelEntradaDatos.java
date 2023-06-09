package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class PanelEntradaDatos extends JPanel
{
    //
    // Atributos
    //

    private JRadioButton rbSi;
    private JRadioButton rbNo;
    private ButtonGroup bgColeccion;
    private JLabel lbTitulo;
    private JLabel lbAutor;
    private JLabel lbEdicion;
    private JLabel lbColeccion;
    private JTextField tfTitulo;
    private JTextField tfAutor;
    private JTextField tfEdicion;
    private Font fontLabel = new Font("Arial", Font.BOLD, 20);
    private Font fontField = new Font("Arial", Font.BOLD, 15);

    //
    // Métodos
    //

    // Método constructor
    public PanelEntradaDatos()
    {
        this.setLayout(null);
        this.setBackground(new Color(31,31,31));

        lbTitulo = new JLabel("Título:", JLabel.RIGHT);
        lbTitulo.setFont(fontLabel);
        lbTitulo.setForeground(Color.WHITE);
        lbTitulo.setBounds(0,20,120,40);
        this.add(lbTitulo);

        lbAutor = new JLabel("Autor(es):", JLabel.RIGHT);
        lbAutor.setFont(fontLabel);
        lbAutor.setForeground(Color.WHITE);
        lbAutor.setBounds(0,60,120,40);
        this.add(lbAutor);

        lbEdicion = new JLabel("Edición:", JLabel.RIGHT);
        lbEdicion.setFont(fontLabel);
        lbEdicion.setForeground(Color.WHITE);
        lbEdicion.setBounds(0,100,170,40);
        this.add(lbEdicion);

        lbColeccion = new JLabel("¿Es un libro de colección?", JLabel.CENTER);
        lbColeccion.setFont(fontLabel);
        lbColeccion.setForeground(Color.WHITE);
        lbColeccion.setBounds(0,140,340,40);
        this.add(lbColeccion);

        rbSi = new JRadioButton("Sí");
        rbSi.setBackground(new Color(31,31,31));
        rbSi.setFont(fontField);
        rbSi.setForeground(Color.WHITE);
        rbSi.setBounds(100,185,50,20);
        this.add(rbSi);

        rbNo = new JRadioButton("No");
        rbNo.setBackground(new Color(31,31,31));
        rbNo.setFont(fontField);
        rbNo.setForeground(Color.WHITE);
        rbNo.setSelected(true);
        rbNo.setBounds(200,185,50,20);
        this.add(rbNo);

        bgColeccion = new ButtonGroup();
        bgColeccion.add(rbSi);
        bgColeccion.add(rbNo);

        tfTitulo = new JTextField();
        tfTitulo.setBackground(new Color(59,59,59));
        tfTitulo.setBorder(null);
        tfTitulo.setFont(fontField);
        tfTitulo.setForeground(Color.WHITE);
        tfTitulo.setCaretColor(Color.WHITE);
        tfTitulo.setBounds(130,30,170,20);
        this.add(tfTitulo);

        tfAutor = new JTextField();
        tfAutor.setBackground(new Color(59,59,59));
        tfAutor.setBorder(null);
        tfAutor.setFont(fontField);
        tfAutor.setForeground(Color.WHITE);
        tfAutor.setCaretColor(Color.WHITE);
        tfAutor.setBounds(130,70,170,20);
        this.add(tfAutor);

        tfEdicion = new JTextField();
        tfEdicion.setBackground(new Color(59,59,59));
        tfEdicion.setBorder(null);
        tfEdicion.setFont(fontField);
        tfEdicion.setForeground(Color.WHITE);
        tfEdicion.setCaretColor(Color.WHITE);
        tfEdicion.setBounds(180,110,40,20);
        this.add(tfEdicion);
    }

    // Métodos de acceso
    public String getTitulo()
    {
        return tfTitulo.getText();
    }

    public String getAutor()
    {
        return tfAutor.getText();
    }

    public String getEdicion()
    {
        return tfEdicion.getText();
    }

    public boolean getEsColeccion()
    {
        if(rbSi.isSelected())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void borrarDatos()
    {
        tfTitulo.setText("");
        tfAutor.setText("");
        tfEdicion.setText("");
        rbNo.setSelected(true);
    }
}
