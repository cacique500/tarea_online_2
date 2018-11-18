
package rmj.indiv02;

import java.io.*;
/**
 *        10. Programa que introducido un número indique si es positivo.
 * Si no lo es finalizará el programa pero en caso de que sea mayor que cero
 * mostrará todos los números entre los que es divisible.
Ejemplo: si se introduce el 20 mostrará: 10, 5, 4, 2 y 1.  
 * @author Jesus David Morales ramos
 */
public class Ejer10{
    public static void main (String args[]) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
 
        System.out.println ("Introduzca un Numero: ");
        String nu = br.readLine ();
        int numero = Integer.parseInt (nu);//declaracion y asignacion del valor introducido a la variable
        //uso de la estructura if.
        if(numero>0){
          for (int i = 1 ; i <= numero ; i++)
            if (numero % i == 0)
                System.out.println (i);
     
      }else{   
      }
 
        
    }
}
