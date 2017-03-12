package proyecto1;

import java.util.Scanner;

public class SumaPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		int resultado=0;
		Scanner teclado = new Scanner(System.in);

		

		for (i=1; i<=10; i++){
		System.out.println("Introduce un numero:");
		int a= teclado.nextInt();
		if (a%2==0)
		resultado=resultado+a;}	
		
		System.out.println(resultado);
	}

}
