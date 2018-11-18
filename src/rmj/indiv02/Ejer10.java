
package rmj.indiv02;

import java.io.*;
/**
 *
 * @author phpjava
 */
public class Ejer10{
    public static void main (String args[]) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
 
        System.out.println ("Introduzca un Numero: ");
        String nu = br.readLine ();
        int n = Integer.parseInt (nu);
        
        if(n>0){
          for (int i = 1 ; i <= n ; i++)
            if (n % i == 0)
                System.out.println (i);
     
      }else{   
      }
 
        
    }
}
