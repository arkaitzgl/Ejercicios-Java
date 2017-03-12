package proyecto1;
import java.util.*;

public class NumeroPerfecto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado= new Scanner (System.in);
		
		int i=0;
		int suma=0;
		
		System.out.println("Introduce un numero:");
		int n= teclado.nextInt();
		
		for (i=1; i<n; i++){
			
			if (n%i==0)
				suma=suma+i;
		}
		
		if (suma==n)
			System.out.println("Es un numero perfecto");
		else
			System.out.println("No es un numero perfecto");
	}

}
