
package paquetedos;

public class PrincipalDos {
    public static void main(String[] args) {
        
        Persona personaUno = new Persona();
        
        personaUno.establecerNombre("Jhon");
        personaUno.establecerGenero("Masculino");
        personaUno.establecerEdad(22);
        
        System.out.printf("Nombre: %s - Edad: %d - Genero: %s\n", 
                personaUno.obtenerNombre(),personaUno.obtenerEdad(), 
                personaUno.obtenerGenero());
    }
    
}
