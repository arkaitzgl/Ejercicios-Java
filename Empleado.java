package proyecto1;
import java.util.*;

public class Empleado {
	
	private Scanner teclado;
	private String nombre;
	private float sueldo; 
	
	public Empleado ()
	{
		teclado= new Scanner (System.in);
		System.out.print("Introduce nombre: ");
		nombre=teclado.next();
		System.out.print("Introduce sueldo: ");
		sueldo=teclado.nextFloat();
		
	}
	
	public void Impuestos(){
		if (sueldo>3000){
			System.out.print("Debe pagar los impuestos");
		}
		else {System.out.print("No tiene que pagar los impuestos");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado empleado1= new Empleado();
		empleado1.Impuestos();
	}

}
