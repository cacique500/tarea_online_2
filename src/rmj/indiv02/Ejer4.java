
package rmj.indiv02;

import java.util.Scanner;

/**
 *    4. Reciba dos números desde teclado. Y realice una de las siguientes acciones: 
        1. Si el primer número es mayor que el segundo realice la resta. 
        2. Si el primer número es menor que el segundo realice la suma. 
        3. Si los números son iguales realice la multiplicación. 
 * @author Jesus David Morales ramos
 */
public class Ejer4 {
    
     public static void main(String[] args) {
             Scanner reader = new Scanner(System.in);                
    int numero1, numero2,resta,suma,multiplicacion;//declaracion de variables.
     
    System.out.println("Dame el primer número");//Salida en pantalla pidiendo el primer numero.
    numero1 = reader.nextInt();//Asinacion del valor introducido a la variable.
    System.out.println("Dame el segundo número");//Salida en pantalla pidiendo el segundo numero.
    numero2 = reader.nextInt();//Asinacion del valor introducido a la variable.
    //Uso de la estructura de control if.
    if(numero1==numero2){//si los numeros son iguales.
      multiplicacion=numero1 * numero2;
      System.out.println("El resultado de multiplicar los dos numeros es:");
      System.out.println(multiplicacion);
      
      } else{
          if(numero1>numero2){//si el primer numero es mayor
              resta= numero1 - numero2;
               System.out.println("El resultado de restar los dos numeros es:");
      System.out.println(resta);
          }else{//si el segundo numero es mayor
           suma= numero1 + numero2;   
            System.out.println("El resultado de sumar los dos numeros es:");
            System.out.println(suma);
          }
      } 
    
     }
    
}