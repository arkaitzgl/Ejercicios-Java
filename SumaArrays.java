package proyecto1;
import java.util.*;

public class SumaArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner teclado =new Scanner (System.in);


int [] caja1;				//primer array
int [] caja2;				//segundo array
int [] sumacajas;			//array en el que guardaré la suma de los arrays
		
int n;						//variable que me indicará la longitud del array
int i;						// variable que controlará el bucle for


		System.out.println("Introduce la longitud del array: ");
		n = teclado.nextInt();
	
	caja1= new int [n];			
	caja2= new int [n];
	sumacajas=new int [n];
	
	
	for (i=0; i<n; i++){
		System.out.print("Introduce los valores del primer array: ");
		caja1[i]=teclado.nextInt();
	}
	
	for (i=0; i<n; i++){
		System.out.print("Introduce los valores del segundo array: : ");
		caja2[i]=teclado.nextInt();
	}
	
	System.out.print("Los resultados de cada posion de los arrays son: ");
	for (i=0; i<n; i++){
		sumacajas[i]=caja1[i]+caja2[i];
		System.out.print(" "+ sumacajas[i]);
	}
	
	}

}
