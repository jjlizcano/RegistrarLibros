package modelo;

public class Libro 
{
    //
    // Atributos
    //

    protected String titulo;
    protected String autor;
    protected String edicion;
    protected Boolean lujo;

    //
    // Métodos
    //

    // Constructor
    public Libro()
    {
        this.titulo = "";
        this.autor = "";
        this.edicion = "";
        this.lujo = false;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public String getAutor()
    {
        return autor;
    }

    public String getAñoEdicion()
    {
        return edicion;
    }

    public Boolean getDeLujo()
    {
        return lujo;
    }
}
