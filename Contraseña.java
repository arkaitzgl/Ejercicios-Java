package proyecto1;
import java.util.*;

public class Contraseņa {
	
	private Scanner teclado;
	private String pass;
	private String pass1;

	public Contraseņa () {}
	
	public void Cargar (){
		teclado=new Scanner (System.in);
		System.out.print("Introduzca contraseņa: ");
		pass=teclado.nextLine();
		pass1="9876qwe";
	}
	
	public void Compara() {
		if (pass.equals (pass1))
			System.out.print("La contraseņa es correcta");
		else System.out.print("Contraseņa incorrecta");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contraseņa contraseņa1=new Contraseņa ();
		contraseņa1.Cargar();
		contraseņa1.Compara();

	}

}
