package proyecto1;

import java.util.Scanner;

public class SumaBucle10 {
	
	public static void main(String[] args) {
		
		int i;
		int resultado=0;
		Scanner teclado = new Scanner(System.in);

		

		for (i=1; i<=10; i++){
		System.out.println("Introduce un numero:");
		int a= teclado.nextInt();
		resultado=resultado+a;}	
		System.out.println(resultado);
		
	}

}
