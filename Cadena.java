
import java.util.*;

public class Cadena {

	private Scanner teclado;
	private String frase;
	private int i;
	private int j;
	private String[] fr;
	private float conca;
	private float cont;
	private float cont1;

	
	public Cadena() {
		cont1=0; 
		cont=0; 
		conca=0;
		teclado = new Scanner(System.in);
		do{
		System.out.println("Escribe una frase: ");
		frase = teclado.nextLine();
		}while (frase.length()>250);
		
	}

	public void Descomponer() {
		fr=frase.trim().split(" +");
		for (i =0; i<fr.length; i++) 
			{
			System.out.println(fr[i]);
			}
		}
	
	
	public void CuentA (){
	
		for (i=0; i<fr.length; i++){
			conca=conca+fr[i].length();
			for (j=0; j<fr[i].length(); j++){
				
				if (fr[i].charAt(j)== 'a' || fr[i].charAt(j)=='A')
					cont ++;
				}
		}
		System.out.println("El número total de caracteres es: " +conca);
		System.out.println("El número total de 'a' es: " +cont);
	}
	
	public void EmpiezA(){
		
		for (i=0; i<fr.length; i++){
				if (fr[i].charAt(0)=='a' || fr[i].charAt(0)=='A'){
					cont1 ++;	
				}
			}System.out.println("El número total de palabras que empiezan por 'a' son: " +cont1);
	}
	
		
	public void PorcentajeA(){
		float p=0; 
		p=(cont*100)/conca;
		System.out.print("El porcentaje 'a' es: ");
		System.out.printf("%.2f",p);
		System.out.print("%");
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cadena c = new Cadena();
		c.Descomponer();
		c.CuentA();
		c.EmpiezA();
		c.PorcentajeA();
	}

}