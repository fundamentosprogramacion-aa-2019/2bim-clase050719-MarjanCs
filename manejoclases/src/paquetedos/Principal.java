
package paquetedos;


public class Principal  {
    public static void main(String[] args) {
        
       /* Persona p;
        p = new Persona();
       */
       
       
        
        Persona p = new Persona();
        Persona persona2 = new Persona();
        
        
        System.out.printf("Nombre: %s - Edad: %d - Genero: %s\n", p.obtenerNombre(), 
                p.obtenerEdad(), p.obtenerGenero());
        
        
        System.out.println("----------------------------------");
       
       // p.nombre = "Miguel";
        p.establecerNombre("Miguel");
       // p.genero = "Masculino";
        p.establecerGenero("Masculino");
       //p.edad = 20;
        p.establecerEdad(20);
        
         System.out.printf("Nombre: %s - Edad: %d - Genero: %s\n", p.obtenerNombre(), 
                p.obtenerEdad(), p.obtenerGenero());
    }
}
