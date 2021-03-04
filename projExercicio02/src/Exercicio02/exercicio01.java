package Exercicio02;
import java.util.Scanner;
public class exercicio01 {
	
	int numero;

	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		exercicio01 e1 = new exercicio01();
			
		System.out.println("Digite Um Número Real: ");
		int numero = ler.nextInt();
		
		if(numero >= 0) {
			System.out.println("Número POsitivo");
		}else {
			System.out.println("Número negativo");
		}
			
	}
}
