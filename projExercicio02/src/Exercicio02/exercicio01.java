package Exercicio02;
import java.util.Scanner;
public class exercicio01 {
	
	int numero;

	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		exercicio01 e1 = new exercicio01();
			
		System.out.println("Digite Um N�mero Real: ");
		int numero = ler.nextInt();
		
		if(numero >= 0) {
			System.out.println("N�mero POsitivo");
		}else {
			System.out.println("N�mero negativo");
		}
			
	}
}
