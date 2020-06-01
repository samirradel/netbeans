package persona;
import java.util.Scanner;

public class persona {
	private Scanner teclado;
	private String nombre;
	private int edad;
	
	public void inicializar() {
		teclado= new Scanner(System.in);
		System.out.println("ingrese nombre");
		nombre=teclado.next();
		System.out.println("ingrese edad");
		edad=teclado.nextInt();
	}
	
	public void imprimir() {
		System.out.println("su nombre es"+nombre);
		System.out.println("su edad es"+edad);
	}
	
	public void MayorEdad() {
		if(edad<18) {
			System.out.println("menor de edad");
		}
		else {
			System.out.println("es mayor de edad");
		}
	}

 public static void main(String[] arg) {
	persona persona1=new persona();
	
	persona1.inicializar();
	persona1.MayorEdad();
	persona1.imprimir();
 }
}
