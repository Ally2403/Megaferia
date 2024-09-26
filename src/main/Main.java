/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import core.Editorial;
import core.Megaferia;
import core.libros.Libro;
import core.libros.LibroDigital;
import core.libros.LibroImpreso;
import core.persona.Autor;
import core.persona.Gerente;
import java.util.ArrayList;

/**
 *
 * @author Santiagodd
 */
public class Main {
    public static void main(String[] args) {
        Megaferia megaferia = new Megaferia();
        megaferia.createStand(100000);
        megaferia.createStand(200000);
        megaferia.createStand(300000);
        megaferia.createStand(500000);
       
        Gerente gerente1 = new Gerente("Juancho", 104893);
        Gerente gerente2 = new Gerente("Santiago", 116971);
       
        Editorial editorial1 = new Editorial("976-213-2132","Planeta","Calle 67 #54-68", gerente1);
        Editorial editorial2 = new Editorial("753-875-1211","Nova","Calle 76 #23-98", gerente2);
       
        ArrayList<Integer> standsIds = new ArrayList<>();
        standsIds.add(0);
        standsIds.add(1);
        standsIds.add(3);
        standsIds.add(4);

        ArrayList<Editorial> editoriales = new ArrayList<>();
        editoriales.add(editorial1);
        editoriales.add(editorial2);

        megaferia.assignStandEditorial(standsIds, editoriales);
        
        Autor autor1 =  new Autor("Gabriel García", 104597);
        Autor autor2 =  new Autor("Pedro Pérez", 921839);
        Autor autor3 =  new Autor("Anna Ruiz", 232145);
        
        ArrayList<Autor> autores = new ArrayList<>();
        autores.add(autor1);
        autores.add(autor2);
        
        ArrayList<Autor> autores1 = new ArrayList<>();
        autores1.add(autor2);
        autores1.add(autor3);
        
        Libro libro1 = new LibroImpreso(520, 65, "Hola me llamo Juan", autores, "899-1212-123", "Terror", "Pasta Dura", 120000, editorial1);
        Libro libro2 = new LibroDigital(false, new ArrayList<String>(), "Buenos días", autores1, "1892-12123", "Comedia", "PDF", 70000, editorial2);
        
        // ----------------------------------------------------------------------------

        System.out.println(megaferia + " -> " + megaferia.getStands());
        System.out.println(megaferia + " -> " + megaferia.getEditoriales() + "\n");

        System.out.println(editorial1 + " -> " + editorial1.getGerente());
        System.out.println(gerente1 + " -> " + gerente1.getEditorial() + "\n");

        System.out.println(editorial2 + " -> " + editorial2.getGerente());
        System.out.println(gerente2 + " -> " + gerente2.getEditorial() + "\n");

        megaferia.verifyStands();

        System.out.println("\n" + editorial1 + " -> " + editorial1.getStands());
        System.out.println(editorial2 + " -> " + editorial2.getStands());
        
        System.out.println("\n" + editorial1 + " -> " + editorial1.getLibros());
        System.out.println(libro1 + " -> " + libro1.getEditorial() + "\n");
        
        System.out.println(editorial2 + " -> " + editorial2.getLibros());
        System.out.println(libro2 + " -> " + libro2.getEditorial() + "\n");
        
        System.out.println(autor1 + " -> " + autor1.getLibros());
        System.out.println(autor2 + " -> " + autor2.getLibros());
        System.out.println(autor3 + " -> " + autor3.getLibros()+ "\n");
        
        System.out.println(libro1 + " -> " + libro1.getAutores());
        System.out.println(libro2 + " -> " + libro2.getAutores());
    }
}
