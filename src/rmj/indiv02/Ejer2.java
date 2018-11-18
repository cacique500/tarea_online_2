

package rmj.indiv02;
import java.util.Scanner;
/**
 *Igual que el ejercicio 1 pero en el caso que sea cero
 * el número introducido muestre por pantalla el mensaje: "el número es cero".
 * @author Jesus David Morales ramos
 */
public class Ejer2 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
      // introduccion de datos por teclado.   
      Scanner sc=new Scanner(System.in);
      System.out.println("Ingresa un numero");
      //declaracion de la variable, asignandole el valor introducido por teclado.
      int numero= sc.nextInt();
      // Uso de la estructura if donde se establece la condicion a ejecutar segun el valor de la variable.
      if(numero==0){
      System.out.println("El numero  es cero");
      } else{
          //Se vuelve a usar la estrucutura if anidandolo en el else del if principal para el valor 0.
          if(numero>0){
              System.out.println("El numero "+numero+" es positivo");
          }else{
          System.out.println("El numero "+numero+" es negativo");
          }
      }     
      }
    
}