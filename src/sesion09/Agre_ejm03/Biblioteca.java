/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion09.Agre_ejm03;

import java.util.List;

/**
 *
 * @author NEISER
 */
public class Biblioteca {
    
    private List<Libro> libros;

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }
    
}
