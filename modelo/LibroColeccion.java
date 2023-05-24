package modelo;

public class LibroColeccion extends Libro
{
    //
    // Atributos
    //

    private String nombreColeccion;
    private int numeroColeccion;

    //
    // Métodos
    //

    // Constructor
    public LibroColeccion(String nombreColeccion, int numeroColeccion)
    {
        this.nombreColeccion = nombreColeccion;
        this.numeroColeccion = numeroColeccion;
    }

    public String getNombreColeccion()
    {
        return nombreColeccion;
    }

    public int getNumeroColeccion()
    {
        return numeroColeccion;
    }
}
