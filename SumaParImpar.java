package proyecto1;

import java.util.Scanner;

public class SumaParImpar {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		int resultado=0;
		int resultado2=0;
		Scanner teclado = new Scanner(System.in);

		

		for (i=1; i<=10; i++){
		System.out.println("Introduce un numero:");
		int a= teclado.nextInt();
		if (a%2==0)
		resultado=resultado+a;
		else resultado2=resultado2+a;}	
		
		System.out.println(resultado);
		System.out.println(resultado2);
	}

}


