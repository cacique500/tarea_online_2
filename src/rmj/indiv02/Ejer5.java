/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmj.indiv02;

import java.util.Scanner;

/**
 *
 * @author phpjava
 */
public class Ejer5 {
    public static void main(String[] args) {    
      System.out.println ("   1. Suma.");
      System.out.println ("   2. Resta.");
      System.out.println ("   3. Multiplicacion");
      System.out.println ("   4. Division");
      System.out.println ("   5. Salir");
     
      System.out.println ("Introduce una opción de dibujo.");      
      Scanner teclado= new Scanner(System.in);
      int opcion=teclado.nextInt(); 
      
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

    

