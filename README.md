# Parcial

En esta parte se declaran las variables a utilizar y se convierten de una vez a strings

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

Aqui se realiza el registro del nuevo libro

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

Aqui se le pregunta al usuario en cual categoria desea guardar el libro


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
