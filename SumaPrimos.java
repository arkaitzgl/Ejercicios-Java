package proyecto1;

import java.util.*;

public class SumaPrimos {

	static boolean primo(int n) {

		boolean prm = true;
		int i = 0;
		int resto = 0;
		if (n == 1) {						// aquí se controla que no me sume el 1
			prm = false;
		} else {
			for (i = 2; i <= n - 1; i++) {		// de esta forma descarto el propio numero y el uno para calcular si es primo
				resto = n % i;
				if (resto == 0 && n != 2) {		//si se cumple esta condicion me devolverá que noes primo
					prm = false;
				}
			}
		}
		return prm;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int suma = 0;				// variable que me irá sumando los números pares
		int r = 0;					//variable en la que guardaré los datos que introduzca
		int x = 0;					//variable que usaré como contador 
		boolean s = true;

		while (x <30) {						//uso un bucle while para controlar que introduzco 30 numeros
			System.out.print("Introduce un numero: ");
			r = teclado.nextInt();

			s = primo(r);
			if (s == true) {
				suma = suma + r;
			}
			x++;
		}

		System.out.println(suma);

	}

}
