/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.libros;

import core.Editorial;
import core.persona.Autor;
import java.util.ArrayList;

/**
 *m
 * @author Santiagodd
 */
public abstract class Libro {
    protected String titulo;  
    protected ArrayList<Autor> autores;
    protected String isbn;  
    protected String genero;  
    protected String formato;
    protected float valor;
    protected Editorial editorial;

    public Libro(String titulo, ArrayList<Autor> autores, String isbn, String genero, String formato, float valor, Editorial editorial) {
        this.titulo = titulo;
        this.autores = autores;
        this.isbn = isbn;
        this.genero = genero;
        this.formato = formato;
        this.valor = valor;
        this.editorial = editorial;
        
        for (Autor autor : this.autores){
            autor.addLibro(this);
        }
        this.editorial.addLibro(this);
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + this.titulo + ", " + this.isbn + ')';
    }
    
}
