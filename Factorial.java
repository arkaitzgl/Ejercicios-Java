package proyecto1;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado= new Scanner (System.in);
		int n=0;
		int i=0;
		int factorial=1;
		
		
		while ((n>10) || (n<1)){
		System.out.println("Introduce un numero");
		n= teclado.nextInt();}
		
		for (i=1; i<=n; i++){
		factorial=factorial*i;}
		System.out.println(factorial);
		
		
	}

}
