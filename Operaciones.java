package proyecto1;
import java.util.*;


public class Operaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


Scanner teclado = new Scanner (System.in);

int x=0;
int y=0;
int resultado=0;

	System.out.println("Introduce un numero: ");
	x= teclado.nextInt();
	System.out.println("Introduce un numero: ");
	y= teclado.nextInt();
	resultado= suma(x,y);
	System.out.println("El resultado de la suma es: " + resultado);
	resultado= resta(x,y);
	System.out.println("El resultado de la resta es: " + resultado);
	resultado= division(x,y);
	System.out.println("El resultado de la division es: " + resultado);
	resultado= multiplicacion(x,y);
	System.out.println("El resultado de la multiplicacion es: " + resultado);
	
	
	}

	static int suma(int a, int b){
		 
		int s=0;
		s=a+b;
		return s;
	}
	static int resta(int a, int b){
		 
		int r=0;
		r=a-b;
		return r;
	}

	static int division(int a, int b){
		 
		int d=0;
		d=a/b;
		return d;
	}
		
	static int multiplicacion(int a, int b){
		 
		int m=0;
		m=a*b;
		return m;
	}
}
