package proyecto1;
import java.util.*;

public class Operarios {

	 private Scanner teclado;
	 private int [] sueldos;
	 
	 
	 
	 public Operarios () {
		 teclado= new Scanner (System.in);
		 sueldos= new int [5];
		 for (int f=0; f<5; f++){
			 System.out.print("Ingrese valor del componente: ");
			 sueldos[f]=teclado.nextInt();
		 }
	 }
	 
	 public void imprimir (){
		 for (int f=0; f<5; f++){
			 System.out.println(sueldos[f]);
		 }
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Operarios op= new Operarios ();
		op.imprimir();
	}

}
