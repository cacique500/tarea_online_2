
package rmj.indiv02;
import java.util.*;
/**
 *     nos diga si queremos mostrar otra tabla de multiplicar. Si el usuario introduce una 
 * 's' 
 * volverá a comenzar el programa y pedirá un nuevo número del que mostrar 
 * la tabla de multiplicar y realizará nuevamente la pregunta de si se quiere
 * mostrar una tabla de multiplicar. 
 * 
 * @author Jesus David Morales ramos
 */
public class Ejer9 {
     public static void main(String[] args) {
        String respuesta;
         do{
         Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.print("Introduce un número entero: ");
        n = sc.nextInt();
        System.out.println("Tabla del " + n);
        for(int i = 1; i<=10; i++){
             System.out.println(n + " * " + i + " = " + n*i);
        }
        System.out.print("¿Desea volver a cargar otra tabla?, si la respuesta es afirmativa introduzca una s.");
        respuesta = sc.next();
        }while(respuesta.equals("s")||respuesta.equals("S"));
        
    }
}
