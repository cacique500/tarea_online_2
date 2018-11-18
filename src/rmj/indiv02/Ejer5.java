
package rmj.indiv02;

import java.util.Scanner;

/**
 *    5. Muestre el siguiente menú. Si se pulsa el número correcto debe mostrar
 * un mensaje indicando que operación se realizaría. Si no coincide con ninguno 
 * debe mostrar por pantalla "Este número no coincide con ninguna de las opciones disponibles". 
        1. Suma 
        2. Resta 
        3. Multiplicación 
        4. División 
        5. Salir 
 * @author Jesus David Morales ramos
 */
public class Ejer5 {
    public static void main(String[] args) {    
      //Salida en pantalla 
      System.out.println ("   1. Suma.");
      System.out.println ("   2. Resta.");
      System.out.println ("   3. Multiplicacion");
      System.out.println ("   4. Division");
      System.out.println ("   5. Salir");
     
      System.out.println ("Introduce una opción de dibujo.");      
      Scanner teclado= new Scanner(System.in);
      int opcion=teclado.nextInt(); //declaracion y asignacion de la variable.
      //Estructura condicional switch
      switch (opcion){
          case 1: 
              System.out.println ("Se ha elegido la opcion sumar.");
              break;
          case 2: 
              System.out.println ("Se ha elegido la opcion restar.");
              break;
          case 3: 
              System.out.println ("Se ha elegido la opcion multiplicar.");
              break;
          case 4: 
              System.out.println ("Se ha elegido la opcion dividir.");
              break;
              case 5: 
              System.out.println ("Se ha elegido la opcion salir.");
              break;
          default:
              System.err.println ("Este número no coincide con ninguna de las opciones disponibles");
      } 
    }
}

    

