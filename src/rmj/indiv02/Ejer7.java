
package rmj.indiv02;

/**
 *    7. Muestre los números pares que hay entre el 50 y el 97. 
 * @author Jesus David Morales ramos
 */
public class Ejer7 {
    public static void main(String[] args) {

	//NUMEROS PARES DEL 1 AL 10 con for
	System.out.println("Acontinuacion se muetra la serie de numeros pares que hay entre el 50 y el 97");
	int num = 50;
	for( num =50; num<=97; num++)
	{
            if (num%2 ==0){
                System.out.println(num + "es par");
            }
	}
	 
    
}
}
