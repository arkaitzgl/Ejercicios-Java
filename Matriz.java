package proyecto1;
import java.util.*;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner teclado= new Scanner (System.in);
	
	int [][]bnfco = new int [3][5];
	int f;
	int c;
	int suma=0;
	
	for (f=0; f<=2; f++)
		{
			for (c=0; c<=4; c++)
			{
			System.out.println("Introduce beneficio");
			bnfco [f][c] = teclado.nextInt();
			}
		}
	for (f=0; f<=2; f++)
	{
		for (c=0; c<=4; c++)
		{
		System.out.print(bnfco[f][c]+ " ");
		}
		System.out.println();
	}

	for (f=0; f<=2; f++)
	{
		suma=0;
		for (c=0; c<=4; c++)
		{
		suma=suma+bnfco[f][c];
		}
		System.out.print("La suma del departamento es: " +suma);
	}
	
	}

}
