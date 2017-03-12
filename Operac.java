package proyecto1;
import java.util.*;


public class Operac {

	private Scanner teclado;
	private double num;
	private double num1;
		
	
	public Operac (){
		teclado=new Scanner (System.in);
		System.out.print("Introduce un numero: ");
		num= teclado.nextDouble();
		System.out.print("Introduce otro numero: ");
		num1= teclado.nextDouble();
		
	}
	
	
	public void suma(){
		double resultado=0;
		resultado=num+num1;
		System.out.println("El resultado de la suma es: "+ resultado);
		
	}
	public void resta(){
		double resultado=0;
		resultado=num-num1;
		System.out.println("El resultado de la resta es: "+ resultado);
		
	}
	public void multiplicacion(){
		double resultado=0;
		resultado=num*num1;
		System.out.println("El resultado de la multiplicacion es: "+ resultado);
		
	}
	public void division(){
		double resultado=0;
		if (num1>0){ 
		resultado=num/num1;
		System.out.println("El resultado de la division es: "+ resultado);}
		else System.out.println("No se puede dividir");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Operac op=new Operac();
		op.suma();
		op.resta();
		op.multiplicacion();
		op.division();
	}

}
