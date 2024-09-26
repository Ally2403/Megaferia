/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.persona;

import core.Editorial;

/**
 *
 * @author Santiagodd
 */
public class Gerente extends Persona {
    private Editorial editorial;

    public Gerente(String nombre, int cedula) {
        super(nombre, cedula);
        this.editorial = null;
        
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public Editorial getEditorial() {
        return editorial;
    }
    
}
