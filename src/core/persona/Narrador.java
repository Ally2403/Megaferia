/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.persona;

import core.libros.AudioLibro;
import java.util.ArrayList;

/**
 *
 * @author Santiagodd
 */
public class Narrador extends Persona{
    private ArrayList<AudioLibro> libros;

    public Narrador(ArrayList<AudioLibro> libros, String nombre, int cedula) {
        super(nombre, cedula);
        this.libros = new ArrayList<>();
    }
    
    public boolean addLibro(AudioLibro libro){
        if(this.libros.contains(libro)){
            this.libros.add(libro);
            return true;
        }
        return false;
    }
}
