

package rmj.indiv02;
import java.util.Scanner;
/**
 *
 * @author Jesus David Morales ramos
 */
public class Ejer1 {

    /**Indique si el número introducido es positivo o negativo mostrando un mensaje por pantalla. 
     * El cero lo consideraremos como número positiv
     * @param args the command line arguments
     */
     public static void main(String[] args) {
      //Entrada de datos   
      Scanner sc=new Scanner(System.in);
      System.out.println("Ingresa un numero");
      //declaracion de la variable, donde se le asignara el valor introducido por teclado.
      int numero= sc.nextInt();
      // Uso de la estructura if donde se establece la condicion a ejecutar segun el valor de la variable.
      if(numero>=0){
      System.out.println("El numero "+numero+" es positivo");//Salida de datos
      } else{
           System.out.println("El numero "+numero+" es negativo");//salida de datos
      }     
      }
    
}
