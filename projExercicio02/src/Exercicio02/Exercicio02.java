package Exercicio02;
import java.util.Scanner;
public class Exercicio02 {
	
	double val1,val2;
	
	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		Exercicio02 e2 = new Exercicio02();
		
		System.out.println("Digite o Primeiro valor: ");
		double val1 = ler.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		double val2 = ler.nextDouble();
		
		if(val1 == val2) {
			System.out.println("Numeros Iguais!");
		}else {
			System.out.println("Numeros Diferentes");
		}
	}
}
