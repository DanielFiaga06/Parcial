/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial;

/**
 *
 * @author Estudiante
 */
public class Parcial {
    private String nombre;
    private double libro;
    
    public Parcial(String nombre, double libro) {
        this.nombre = nombre;
        this.libro = libro;
     
    } 

    public Parcial() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public String getNombre() {
        return nombre;
    
    }
    public double getlibro(){
        return libro;
       
    }
    public String toString(){
       return nombre + " - " + libro;
   }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
