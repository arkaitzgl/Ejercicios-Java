import java.util.*;

public class TablasUnid {

	private Scanner teclado;
	private int[] tabla1;
	private int[] tabla2;
	private int[] tabla3;
	private int x;
	private int i;

	public TablasUnid() {
		teclado = new Scanner(System.in);
		tabla1=  new int[30];
		tabla2=  new int[30];
		tabla3=  new int[30];
	}

	public void Cargar() {

		i = 0;
		x = 0;
		System.out.println("Introduzca el numero de posiciones que desea rellenar: ");
		x = teclado.nextInt();

		for (i = 0; i < x; i++) {
			System.out.println("Introduce numero de tabla1: ");
			tabla1[i] = teclado.nextInt();
		}
		for (i = 0; i < x; i++) {
			System.out.println("Introduce numero de tabla2: ");
			tabla2[i] = teclado.nextInt();
		}
	}

	public void Compara() {

		for (i = 0; i < x; i++) {
			if (tabla1[i] == tabla2[i]) {
				tabla3[i] = tabla1[i];
			} else {
				tabla3[i] = -1;
			}
		}

	}
	public void Imprimir (){
		for (i=0; i<x; i++){
			System.out.print(tabla1[i] + " ");
		}
		
		System.out.println("");
		
		for (i=0; i<x; i++){
			System.out.print(tabla2[i] + " ");
			System.out.print("");
		}
		System.out.println("");
		
		for (i=0; i<x; i++){
			System.out.print(tabla3[i] + " ");
			System.out.print("");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	TablasUnid tu=new TablasUnid ();
	tu.Cargar();
	tu.Compara();
	tu.Imprimir();
	}

}
