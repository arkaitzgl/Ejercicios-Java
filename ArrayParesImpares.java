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

		int[] caja;			//aqui se guardará el array
		int n;				//variable que me indicará la longitud del array
		int i;				// variable que controlará el bucle for
		int sp = 0;			//variable que me guardará el valor que me retorne la función sumapar
		int si = 0;			//variable que me guardará el valor que me retorne la función sumaimpar

		System.out.println("Introduce la longitud del array: ");
		n = teclado.nextInt();

		caja = new int[n];

		for (i = 0; i < n; i++) {
			System.out.print("Introduce los valores del array: ");
			caja[i] = teclado.nextInt();
		}
		sp = sumapar(caja);				//llamada a la función sumapar y le pasamos como parámetros el array caja
		si = sumaimpar(caja);			//llamada a la función sumaimpar y le pasamos como parámetros el array caja

		System.out.println("La suma de los pares es: " + sp);
		System.out.println("La suma de los impares es: " + si);

		if (sp > si)				// Hace la comparación para saber cual de las dos es mayor
			System.out.println("La suma de los pares es mayor que la de los impares");
		else
			System.out.println("La suma de los impares es mayor que la de los pares");
	}

}
