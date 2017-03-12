package proyecto1;
import java.util.*;

public class AlturaPersonas {
	
	private Scanner teclado;
	private float [] altura;
	private float m;
	
	
	public AlturaPersonas (){
		teclado=new Scanner (System.in);
		altura= new float [5];
		
		for(int i=0; i<5; i++){
			System.out.print("Introduce la altura: ");
			altura [i] = teclado.nextFloat();
		}
		
	}

	public void media(){
		float suma=0;
	
		for (int i =0; i<5; i++){
		suma= suma + altura [i];	
		}
		m = suma/5;
		System.out.println("La media es: " + m);
	}
		
	public void MayoresMenores(){	
		int cont=0;
		int cont1=0;
		for (int x=0; x<5; x++){
			if (m<altura[x]){
				cont++;}
			else {cont1++;}
			
		
	}
	
		System.out.println("Hay " + cont + " por encima de la media");
		System.out.println("Hay " + cont1 + " por debajo de la media");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AlturaPersonas ap= new AlturaPersonas ();
		
		ap.media();
		ap.MayoresMenores();
		
	}

}
