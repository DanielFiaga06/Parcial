
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Estudiante
 */
public class Guardar {
    private String usuario;
    private ArrayList<Libro> libros;
    private double total;
    
    public Guardar(String usuario){
        this.usuario = usuario;
        this.libros = libros;
        
    }
    public void guardarLibro(){ 
        try (FileWriter writer = new FileWriter("libros.txt", true)){
            writer.write("Usuario: " + usuario + "\n");
            for (Libro l : libros){
                writer.write("- " + l.getNombre());
            }
            writer.write("Total: " + total);
            writer.write("--------------------------\n");
        } catch (IOException ex) {
            Logger.getLogger(Guardar.class.getName()).log(Level.SEVERE, null, ex);
        }

   
        }

        
    }
    
    

   
    
    
    
    
    
    
    
    
    
    
    

