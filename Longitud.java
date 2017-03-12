package proyecto1;
import  java.util.*;

public class Longitud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner teclado = new Scanner (System.in);

int [] elementos= new int [21];

int x;
int j=0;
int i=0;

do { 
	System.out.print("Introduce un numero: ");
	x = teclado.nextInt();  
	if (x!=0){
	elementos[i]= x;	
	
	i++;}
	
}while (x!=0 && i!=20);		
System.out.println(i);
for (j=0; j<i; j++){
	System.out.print(" " +elementos[j]);
}
	}

}
