package modelo;

public class Libro 
{
    //
    // Atributos
    //

    protected String titulo;
    protected String autor;
    protected String añoEdicion;
    protected Boolean deLujo;

    //
    // Métodos
    //

    // Constructor
    public Libro()
    {
        this.titulo = "";
        this.autor = "";
        this.añoEdicion = "";
        this.deLujo = false;
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
        return añoEdicion;
    }

    public Boolean getDeLujo()
    {
        return deLujo;
    }
}
