package proyecto1;
import java.util.*;

public class Contraseña {
	
	private Scanner teclado;
	private String pass;
	private String pass1;

	public Contraseña () {}
	
	public void Cargar (){
		teclado=new Scanner (System.in);
		System.out.print("Introduzca contraseña: ");
		pass=teclado.nextLine();
		pass1="9876qwe";
	}
	
	public void Compara() {
		if (pass.equals (pass1))
			System.out.print("La contraseña es correcta");
		else System.out.print("Contraseña incorrecta");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contraseña contraseña1=new Contraseña ();
		contraseña1.Cargar();
		contraseña1.Compara();

	}

}
