
package paquetedos;

public class PrincipalTres {
    public static void main(String[] args) {
        
        /*int [] lista = new int [3];
        String [] lista2 = new String [3];
        double [] lista3 = new double [3];
        */
        int promedio = 0;
        int suma = 0;
        
        Persona[] lista4 = new Persona[3];
        
        
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        
        persona1.establecerNombre("Denis");
        persona2.establecerNombre("Carlos");
        persona3.establecerNombre("Miguel");
        
        persona1.establecerEdad(22);
        persona2.establecerEdad(23);
        persona3.establecerEdad(21);
        
        persona1.establecerGenero("Masculino");
        persona2.establecerGenero("Masculino");
        persona3.establecerGenero("Masculino");
        
        lista4[0] = persona1;
        lista4[1] = persona2;
        lista4[2] = persona3;
        
        for (int i = 0; i < lista4.length ; i++) {
            
            Persona p = lista4[i];
            
            System.out.printf("Nombre : %s - %s \n", p.obtenerNombre()
            ,p.obtenerGenero() );
            
            suma = suma + p.obtenerEdad();
 
        }
        promedio = suma / lista4.length;
        
        System.out.printf("El promedio de edades es : %d ", promedio);
    }
    
}
