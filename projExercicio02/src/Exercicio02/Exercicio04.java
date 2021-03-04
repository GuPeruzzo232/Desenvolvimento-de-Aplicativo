package Exercicio02;
import java.util.Scanner;
public class Exercicio04 {

	double val1,val2;
	
	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		Exercicio04 e4 = new Exercicio04();
		
		
		System.out.println("Digite O Primeiro Valor: ");
		double val1 = ler.nextDouble();
		
		System.out.println("Digite O Segundo Valor: ");
		double val2 = ler.nextDouble();
		
		if(val1 > val2) {
			System.out.println("Primeiro valor maior!! " + val1);
		}else {
			System.out.println("Segundo Valor Maior!! " + val2);
		}
		
	}
}
