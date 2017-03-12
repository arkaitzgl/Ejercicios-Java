package proyecto1;

import java.util.Scanner;

public class MatrizCurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado= new Scanner (System.in);
		
		int[][]aula = new int [4][4];
		int f=0;
		int c=0;
		int media=0;
		int suma=0;
		int mayor=0;
		int x=0;
		int y=0;
		int i=0;
		
		for (f=0; f<=3; f++)
		{
			for (c=0; c<=3; c++)
			{
			System.out.println("Introduce nota");
			aula [f][c] = teclado.nextInt();
			}
		}
	for (f=0; f<=3; f++)
	{
		for (c=0; c<=3; c++)
		{
		System.out.print(aula[f][c]+ " ");
		}
		System.out.println();
	}
		
	for (f=0; f<=3; f++)
	{
		suma=0;
		for (c=0; c<=3; c++)
		{
		suma=suma+aula[f][c];
		media=suma/4;
		}
		System.out.println("La nota media del curso es: " +media);
	}
	for (f=0; f<=3; f++)
	{  
		for (c=0; c<=3; c++)
		{
			if (aula[f][c]>mayor){
				mayor=aula[f][c];
				x=f+1;
				y=c+1;
				}
		}
		
	}	
	System.out.println("La nota mas alta es:" + mayor + "y el alumno" + y + " y el curso" + x );
	
	
	for (f=0; f<=3; f++)
	{
		for (c=0; c<=3; c++)
		{
			if (aula[f][c]<5)
				i++;
				
		}
	
	}
	for (c=0; c<=3; c++)
	{suma=0;
		for (f=0; f<=3; f++)
		{
			suma=suma+aula[f][c];
			media=suma/4;
				
		}
	if (media>=5)
		System.out.println("La media es " + media + " pasa a bachiller");
	else 
		System.out.println("La media es " + media + " repite");
	}
		
	
	}

}
