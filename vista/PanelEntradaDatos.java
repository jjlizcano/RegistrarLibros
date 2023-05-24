package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelEntradaDatos extends JPanel
{
    //
    // Atributos
    //

    private JLabel lbLibros;
    private JComboBox cbLibros;
    private JLabel lbLibrosColeccion;
    private JComboBox cbLibrosColeccion;

    private Font fontLabel = new Font("Arial", Font.BOLD, 15);

    //
    // Métodos
    //

    // Constructor
    public PanelEntradaDatos()
    {
        this.setLayout(null);
        this.setBackground(new Color(31,31,31));

        lbLibros = new JLabel("Libros");
        lbLibros.setBounds(40,20,60,20);
        lbLibros.setFont(fontLabel);
        lbLibros.setForeground(Color.WHITE);
        this.add(lbLibros);

        lbLibros = new JLabel("Libros de colección");
        lbLibros.setBounds(160,20,200,20);
        lbLibros.setFont(fontLabel);
        lbLibros.setForeground(Color.WHITE);
        this.add(lbLibros);

        cbLibros = new JComboBox();
        cbLibros.setBounds(40,50,100,20);
        this.add(cbLibros);

        cbLibrosColeccion = new JComboBox();
        cbLibrosColeccion.setBounds(180,50,100,20);
        this.add(cbLibrosColeccion);
    }

    // Libro seleccionado

    public String getLibroSeleccionado()
    {
        return (String)cbLibros.getSelectedItem();
    }

    public int getIndexLibro()
    {
        return cbLibros.getSelectedIndex();
    }

    public void setLibro(String lib)
    {
        cbLibros.addItem(lib);
    }

    // Libro de colección seleccionado

    public String getLibroColeccionSeleccionado()
    {
        return (String)cbLibrosColeccion.getSelectedItem();
    }

    public int getIndexLibroColeccion()
    {
        return cbLibrosColeccion.getSelectedIndex();
    }

    public void setLibroColeccion(String lib)
    {
        cbLibrosColeccion.addItem(lib);
    }
}
