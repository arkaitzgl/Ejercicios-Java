package proyecto1;
import java.util.*;

public class Alumnos {

	private Scanner teclado;
	private String nombre;
	private int edad;
	
	public Alumnos (){
		teclado= new Scanner (System.in);
		System.out.print("Introduce nombre: ");
		nombre= teclado.next();
		System.out.print("Introduce edad: ");
		edad=teclado.nextInt();
		
	}
	
	public void imprimir (){
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
	}
	
	public void MayordeEdad(){
		if (edad>=18){
			System.out.print(nombre+ " es mayor de edad");
		}
		else {System.out.print(nombre+ " no es mayor de edad");
			
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Alumnos alumno1=new Alumnos();
alumno1.imprimir();
alumno1.MayordeEdad();

	}

}
