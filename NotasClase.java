package proyecto1;
import java.util.*;



public class NotasClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int suma=0;
		double media=0;
		int i=0;
		int [] alumnos = new int [18];
		Scanner teclado = new Scanner(System.in);
		int mayor=0;
		int x=0;
		int y=0;
		int menor=0;
		
	
	for (i=0; i<8; i++){
		System.out.println("Introduce notas");
		alumnos[i]= teclado.nextInt();
		suma=suma + alumnos[i];
	}
	media= suma/8;
	System.out.println(media);
	
	for (i=0; i<8;i++)
		{
		if (alumnos[i]>mayor){
			mayor= alumnos[i];
			x=i+1;}
		}
	
	System.out.println(mayor + " y "+ x);
	menor=mayor;
	for (i=0; i<8; i++)
		{
		if (alumnos[i]<menor){
		menor= alumnos [i];
		y=i+1;}
		}
	
	System.out.println(menor + " y "+ y);
	}

}
