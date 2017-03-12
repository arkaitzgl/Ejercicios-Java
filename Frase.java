package proyecto1;

import java.util.*;

public class Frase {

	private Scanner teclado;
	private String linea;
	private char espacio;

	public Frase() {

		espacio = ' ';
		teclado = new Scanner(System.in);
		System.out.println("Escribe una frase: ");
		linea = teclado.nextLine();
	}

	public void Descompone() {

		int x = 0;
		int pos = 0;
		int pos1 = 0;
		
		for (int i = 0; i < linea.length(); i++) {
			if (linea.charAt(i) == espacio) {
				pos1 = i;
				String fr = linea.substring(pos, pos1);
				pos = pos1 + 1;
				x++;
			}
		}
		System.out.println("Hay " + x + " palabras");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frase f = new Frase();
		f.Descompone();
	}

}
