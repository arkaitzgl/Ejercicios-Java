package proyecto1;

import java.util.Scanner;

public class FuncionFactorial {

	static int factorial (int x)
	{
	int i=0;
	int f=1;
	for ( i=1; i<=x; i++)
	{
	f=f*i;}
	return f;
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado= new Scanner (System.in);
		int n=1;
		int fact=0;
		
		
		while ((n>10) || (n<=1)){
			System.out.println("Introduce un numero");
			n= teclado.nextInt();
			fact=factorial(n);}
		System.out.println(fact);
		
	}
	
	

}
