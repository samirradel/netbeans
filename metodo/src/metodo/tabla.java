package metodo;
import java.util.Scanner;

public class tabla {
	
	public void Introducir() {
		System.out.println("TABLA DE MULTIPLICAR");
		
		
		Scanner teclado=new Scanner(System.in);
		int n;
		do {
			
			System.out.println("Ingrese la tabal del que desea saber");
			n=teclado.nextInt();
			
			if(n!=-1) {
				Producir(n);
			}
			System.out.println("Si deseas parar la operacion pon -1");
			
		}while(n!=-1);
		
		
	}
		
	
	
	public void Producir(int n) {
		int k;
		for( k=1;k<13;k++) {
			System.out.println(n+"x"+k+"="+k*n);
		}
	}
	
	public static void main(String[] arg) {
		
		tabla multiplicar=new tabla();
		
		multiplicar.Introducir();
		
	}

}
