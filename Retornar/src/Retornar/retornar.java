package Retornar;
import java.util.Scanner;
public class retornar {
	public void IntroducirDatos() {
		Scanner teclado=new Scanner(System.in);
		int n1,n2,n3;
		System.out.println("ingrese primer numero");
		n1=teclado.nextInt();
		System.out.println("ingrese segundo numero");
		n2=teclado.nextInt();
		System.out.println("ingrese el tercer numero");
		n3=teclado.nextInt();
		System.out.println("el numero mayor es");
		int Mayor=mayor(n1,n2,n3);
		System.out.println(Mayor);
	}
	
	public int mayor(int n1,int n2, int n3) {
		int m;
		if(n1>n2 && n1>n3) {
			m=n1;
		}
		else {
			if(n2>n3) {
				m=n2;
			}
			else {
				m=n3;
			}
		}
		
		return m;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		retornar mayor=new retornar();
		mayor.IntroducirDatos();

	}

}
