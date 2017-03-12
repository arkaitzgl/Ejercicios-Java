package proyecto1;
import java.util.*;

public class DiasMes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado= new Scanner (System.in);

System.out.println("Introduce el mes");
int mes= teclado.nextInt();

switch (mes){

case 1:
	System.out.println("Enero 31 dias");
break;
case 2:
	System.out.println("Febrero 28 dias");
break;
case 3:
	System.out.println("Marzo 31 dias");
break;
case 4:
	System.out.println("Abril 30 dias");
break;
case 5:
	System.out.println("Mayo 31 dias");
break;
case 6:
	System.out.println("Junio 30 dias");
break;
case 7:
	System.out.println("Julio 31 dias");
break;
case 8:
	System.out.println("Agosto 31 dias");
break;
case 9:
	System.out.println("Septiembre 30 dias");
break;
case 10:
	System.out.println("Octubre 31 dias");
break;
case 11:
	System.out.println("Noviembre 30 dias");
break;
case 12:
	System.out.println("Diciembre 31 dias");
break;
default: System.out.println("Por favor introduce un numero del 1 al 12");
}
	}

}
