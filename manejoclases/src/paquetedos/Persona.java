
package paquetedos;


public class Persona {
    private String genero;
    private int edad;
    private String nombre;
    
    
    public  void establecerGenero(String g){ // set
        genero = g;  
    }

    public String obtenerGenero() { // get
        return genero;
    }
    
     public  void establecerNombre(String g){ // set
        nombre = g;  
    }

    public String obtenerNombre() { // get
        return nombre;
    }
    
    public  void establecerEdad(int g){ // set
        edad = g;  
    }

    public int obtenerEdad() { // get
        return edad;
    }
    
  }

   

