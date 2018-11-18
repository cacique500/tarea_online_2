/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmj.indiv02;
import java.util.*;
/**
 *Programa que lea un número entero N y muestre la tabla de multiplicar de ese número.
 * @author phpjava
 */
public class Ejer9 {
     public static void main(String[] args) {
        String respuesta;
         do{
         Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.print("Introduce un número entero: ");
        n = sc.nextInt();
        System.out.println("Tabla del " + n);
        for(int i = 1; i<=10; i++){
             System.out.println(n + " * " + i + " = " + n*i);
        }
        System.out.print("¿Desea volver a cargar otra tabla?, si la respuesta es afirmativa introduzca una s.");
        respuesta = sc.next();
        }while(respuesta.equals("s")||respuesta.equals("S"));
        
    }
}
