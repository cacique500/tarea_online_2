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
public class Ejer3 {
    
     public static void main(String[] args) {
             Scanner reader = new Scanner(System.in);                
    int Numero1, Numero2;
     
    System.out.println("Dame el primer número");
    Numero1 = reader.nextInt();
    System.out.println("Dame el segundo número");
    Numero2 = reader.nextInt();
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
