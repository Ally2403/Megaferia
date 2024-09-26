/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.ArrayList;

/**
 *
 * @author Santiagodd
 */
public class Stand {
    private static int idCount = 0;
    
    private int id;
    private float costo;
    private ArrayList<Editorial> editoriales;

    public Stand(float costo) {
        this.id = Stand.idCount;
        this.editoriales = new ArrayList<>();
        this.costo = costo;
        
        Stand.idCount++;
    }
    
    public int getId(){
        return this.id;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + id + ", " + costo + ')';
    }
    
    
    
}
