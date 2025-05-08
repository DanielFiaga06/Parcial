
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Estudiante
 */
public class Menu {
    
    private String nombre;
    private ArrayList<Libro> libros;
    
    public Menu(String nombre){
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    /**
     *
     * @param libro
     */
    public  void agregarlibro(Libro libro){
        libros.add(libro);
    }
    public ArrayList<Libro> getlibros(){
        return libros;
    }
    
    public void mostrarmenu(){
        System.out.println("\n--- " + nombre + " ---");
        for (int i =0; i < libros.size(); i++){
            System.out.println((i+1) + ". " + libros.get(i));
        }
    }

    
}
