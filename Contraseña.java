package proyecto1;
import java.util.*;

public class Contrase�a {
	
	private Scanner teclado;
	private String pass;
	private String pass1;

	public Contrase�a () {}
	
	public void Cargar (){
		teclado=new Scanner (System.in);
		System.out.print("Introduzca contrase�a: ");
		pass=teclado.nextLine();
		pass1="9876qwe";
	}
	
	public void Compara() {
		if (pass.equals (pass1))
			System.out.print("La contrase�a es correcta");
		else System.out.print("Contrase�a incorrecta");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contrase�a contrase�a1=new Contrase�a ();
		contrase�a1.Cargar();
		contrase�a1.Compara();

	}

}
