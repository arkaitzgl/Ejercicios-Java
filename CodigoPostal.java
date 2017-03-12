package proyecto1;

import java.util.*;

public class CodigoPostal {

	private Scanner teclado;
	private String[] codigo;

	public CodigoPostal() {

		teclado = new Scanner(System.in);
		codigo = new String[5];

		for (int i = 0; i < 5; i++) {
			System.out.print("Introduce codigo postal: ");
			codigo[i] = teclado.nextLine();
		}
	}

	public void Compara() {
		for (int i = 0; i < 5; i++) {
			if (codigo[i].charAt(2) == '0')
				System.out.println(codigo[i] + " Este es un código de capital de provincia");
			else
				System.out.println(codigo[i] + " Este no es un código de capital de provincia");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CodigoPostal cp=new CodigoPostal ();
		
		cp.Compara();
	}

}
