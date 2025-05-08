
import java.util.Scanner;
import parcial.Parcial;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        Guardar Ciencia = new Guardar("Ciencia");
        Ciencia.agregarlibro(new Parcial);
        
        Guardar Literatura = new Guardar("Literatura");
        Literatura.agregarlibro(new Parcial);
        
        Guardar Ingenieria = new Guardar("Ingenieria");
        Ingenieria.agregarlibro(new Parcial);
        
        Menu[] menus = {Ciencia, Literatura, Ingenieria};
        
        while (true){
            System.out.println("\n--- Sistema de la Biblioteca ---");
            System.out.println("1. Registrar nuevo usuario");
            System.out.println("2. Registrar nuevo libro");
            System.out.println("3. Salir");
            String opcion = sc.nextLine();
            if (opcion.equals("1")) {
                for (Menu menu : menus) {
                    menu.mostrarmenu();
            
            
             
        }
        
       
    }
            
            else if (opcion.equals("2")) {
                System.out.print("Nombre del usuario: ");
                String usuario = sc.nextLine();
                System.out.print("Seleccione categoria (1-Ciencia, 2-Literatura, 3-Ingenieria): ");
                int menuIndex = Integer.parseInt(sc.nextLine()) - 1;
                menus[menuIndex].mostrarmenu();
                Guardar.guardarLibro();
                System.out.println("Libro guardado exitosamente.");
    
}
        }
    }
}