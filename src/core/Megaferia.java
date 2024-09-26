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
public class Megaferia {
    private ArrayList<Stand> stands;
    private ArrayList<Editorial> editoriales;

    public Megaferia() {
        this.stands = new ArrayList<>();
        this.editoriales = new ArrayList<>();
    }
    
    public void createStand(float costo){
        this.stands.add(new Stand(costo));
    }
    
    public void verifyStands(){
        for (Stand stand : this.stands){
            System.out.println(stand);
        }
    }
    
    public boolean addEditorial(Editorial editorial){
        if(!this.editoriales.contains(editorial)){
            this.editoriales.add(editorial);
            return true;
        }
        return false;
    }
}
