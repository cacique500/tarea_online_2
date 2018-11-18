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
public class Ejer4 {
    
     public static void main(String[] args) {
             Scanner reader = new Scanner(System.in);                
    int numero1, numero2,resta,suma,multiplicacion;
     
    System.out.println("Dame el primer número");
    numero1 = reader.nextInt();
    System.out.println("Dame el segundo número");
    numero2 = reader.nextInt();
    if(numero1==numero2){
      multiplicacion=numero1 * numero2;
      System.out.println("El resultado de multiplicar los dos numeros es:");
      System.out.println(multiplicacion);
      
      } else{
          if(numero1>numero2){
              resta= numero1 - numero2;
               System.out.println("El resultado de restar los dos numeros es:");
      System.out.println(resta);
          }else{
           suma= numero1 + numero2;   
            System.out.println("El resultado de sumar los dos numeros es:");
            System.out.println(suma);
          }
      } 
    
     }
    
}