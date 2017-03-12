package proyecto1;

import java.util.*;

public class Fact {
	private Scanner teclado;
	private int[] numeros;

	public Fact() {
		teclado = new Scanner(System.in);
		numeros = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduce numero: ");
			numeros[i] = teclado.nextInt();
		}
	}

	public void factorial() {
		int i = 0;
		int x = 0;
		int resultado=0;
		for (i = 0; i < 5; i++) {
			resultado=numeros[i];
			for (x = 1; x <numeros[i]; x++) {
				resultado = resultado * x;
			}
			System.out.println(resultado);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fact f = new Fact();
		f.factorial();

	}

}
