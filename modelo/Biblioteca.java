package modelo;

import java.util.ArrayList;

public class Biblioteca
{
    //
    // Atributos
    //

    private ArrayList<Libro> libros;
    private ArrayList<LibroColeccion> librosColeccion;

    //
    // Métodos
    //

    public Biblioteca()
    {
        libros = new ArrayList();
        librosColeccion = new ArrayList();
    }

    public void agregarLibro(Libro pLibro)
    {
        libros.add(pLibro);
    }

    public void agregarLibroColeccion(LibroColeccion pLibroColeccion)
    {
        librosColeccion.add(pLibroColeccion);
    }
}
