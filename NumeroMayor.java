package proyecto1;
import java.util.*;

public class NumeroMayor {

		public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner teclado= new Scanner (System.in);

System.out.println("Introduce el valor de a");
int a= teclado.nextInt();

System.out.println("Introduce el valor de b");
int b= teclado.nextInt();

if (a>b)
{System.out.println(a + " A es el mayor");
	}	
else {System.out.println(b + " B es el mayor");}
		}

}
