package proyecto1;

import java.util.*;

public class ArrayParesImpares {

	static int sumapar(int a[]) {

		int i = 0;
		int suma = 0;
		for (i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0)
				suma = suma + a[i];

		}
		return suma;
	}

	static int sumaimpar(int a[]) {

		int i = 0;
		int suma = 0;
		for (i = 0; i < a.length; i++) {

			if (a[i] % 2 != 0)
				suma = suma + a[i];

		}
		return suma;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int[] caja;			//aqui se guardar� el array
		int n;				//variable que me indicar� la longitud del array
		int i;				// variable que controlar� el bucle for
		int sp = 0;			//variable que me guardar� el valor que me retorne la funci�n sumapar
		int si = 0;			//variable que me guardar� el valor que me retorne la funci�n sumaimpar

		System.out.println("Introduce la longitud del array: ");
		n = teclado.nextInt();

		caja = new int[n];

		for (i = 0; i < n; i++) {
			System.out.print("Introduce los valores del array: ");
			caja[i] = teclado.nextInt();
		}
		sp = sumapar(caja);				//llamada a la funci�n sumapar y le pasamos como par�metros el array caja
		si = sumaimpar(caja);			//llamada a la funci�n sumaimpar y le pasamos como par�metros el array caja

		System.out.println("La suma de los pares es: " + sp);
		System.out.println("La suma de los impares es: " + si);

		if (sp > si)				// Hace la comparaci�n para saber cual de las dos es mayor
			System.out.println("La suma de los pares es mayor que la de los impares");
		else
			System.out.println("La suma de los impares es mayor que la de los pares");
	}

}
