
package rmj.indiv02;

import java.util.Scanner;

/**
 *Indique cuál es el mayor de dos números introducidos por teclado. Si son iguales también ha de notificarlo. 
 * @author Jesus David Morales ramos
 */
public class Ejer3 {
    
     public static void main(String[] args) {
             Scanner reader = new Scanner(System.in); // Instanciando la variable reader.              
    int Numero1, Numero2;//declaracion de las variables
     
    System.out.println("Dame el primer número");//salida en pantalla pidiendo el primer valor.
    Numero1 = reader.nextInt();//Asignacion de la variable con el valor introducido por teclado.
    System.out.println("Dame el segundo número");//salida en pantalla pidiendo el segundo valor.
    Numero2 = reader.nextInt();//Asignacion de la variable con el valor introducido por teclado.
    //uso de la estructura if.
    if(Numero1==Numero2){
      System.out.println("Los dos numeros introducidos son iguales");
      } else{
          if(Numero1>Numero2){
               System.out.println(Numero1 + " es mayor que " + Numero2);
          }else{
           System.out.println(Numero2 + " es mayor que " + Numero1);
          }
      } 
    
     }
    
}
