package proyecto1;

import java.util.*;

public class SaltodeLongitud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int ficha[][] = new int[10][4];
		String nom[] = new String[10];
		int menu = 0;
		int i;
		int tam = 0;
		int d = 0;
		int m0 = 0;
		int m1 = 0;
		int m2 = 0;
		boolean drop = true;
		int cont = 0;
		int aux=0;
		int x=0;
		int z=0;
		
		do {

			System.out.println("1.-Incribir un participante");
			System.out.println("2.-Mostrar listado de datos");
			System.out.println("3.-Mostrar listado por marcas");
			System.out.println("4.-Salir");
			System.out.println();

			System.out.print("Introduce un numero: ");
			menu = teclado.nextInt();
			System.out.println();
			
			switch (menu) {

			case 1:

				System.out.print("Teclea el numero del dorsal: ");
				d = teclado.nextInt();
				drop = false;
				i = 0;

				while (ficha[i][0] != 0 && drop == false) {
					if (ficha[i][0] == d) {
						drop = true;
						System.out.println("Ya existe");
					}
					i++;
				}
					if (drop == false) {
						ficha[i][0] = d;
						System.out.println("Introduce nombre del participante: ");
						nom[cont] = teclado.next();
						System.out.println("Introduce marca del 2000: ");
						m0 = teclado.nextInt();
						ficha[i][1] = m0;
						System.out.println("Introduce marca del 2001: ");
						m1 = teclado.nextInt();
						ficha[i][2] = m1;
						System.out.println("Introduce marca del 2002: ");
						m2 = teclado.nextInt();
						ficha[i][3] = m2;
						cont++;
						}


				break;

			case 2:
				
				System.out.println("Introduce el numero de dorsal que desea buscar: ");
				aux=teclado.nextInt(); 
				
				System.out.println("El dorsal "+ aux +" tiene los siguientes datos: ");
				for (i=0; i<10; i++){
					if (ficha[i][0]==aux){
					x=i;
					for (z=0; z<4; z++){
						
						System.out.println(ficha[x][z]);
					}
						
					}
					
				}
				
				break;

			case 3:
				System.out.println("Mostrar listado por marcas");
				
				
				break;
			case 4:
				System.out.println("Fin");
				break;
			default:
				System.out.println("Por favor, introduce un numero del 1 al 4");
			}

		} while (menu != 4);
	}

}
