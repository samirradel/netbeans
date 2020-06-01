package basicos;
import java.util.Scanner;
public class basico {
	public static void main(String[] arg) {
		Scanner teclado=new Scanner(System.in);
		
		String texto;
		int numero;
		float real;
		
		texto="hola mundo";
		System.out.println(texto);
		
		System.out.println("ingrese entero");
		numero=teclado.nextInt();
		
		System.out.println("ingrese real");
		real=teclado.nextFloat();
		
		int i;
		for(i=0;i<numero;i++) {
			System.out.println(i);
		}
		
		int valor;
		
		do {
			System.out.println("ingrese un valor menor a 10");
			valor=teclado.nextInt();
			if(valor<10) {
				System.out.println("valor aceptado");
		        System.out.println("ingrese 0 si quiere parar");
			}
			
		}while(valor!=0);
		
	}

}
