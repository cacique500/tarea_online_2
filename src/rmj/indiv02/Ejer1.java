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
public class Ejer1 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Ingresa un numero");
      int n= sc.nextInt();
      if(n>=0){
      System.out.println("El numero "+n+" es positivo");
      } else{
           System.out.println("El numero "+n+" es negativo");
      }     
      }
    
}
