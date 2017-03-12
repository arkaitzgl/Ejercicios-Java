package proyecto1;
import java.util.*;


public class Mail {
	
	private Scanner teclado;
	private String email;

	
public void Cargar(){
	teclado=new Scanner (System.in);
	System.out.print("Introduzca el email: ");
	email=teclado.nextLine();
}
	
public void comprobar(){

	boolean a=false;
	
	for (int x=0; x<email.length(); x++){
		if (email.charAt(x)=='@'){
			a=true;			
		}
	}
	if (a==true){
	System.out.println("El mail tiene @");}
	else System.out.println("El mail no tiene @");
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mail em=new Mail();
		em.Cargar();
		em.comprobar();

	}

}
