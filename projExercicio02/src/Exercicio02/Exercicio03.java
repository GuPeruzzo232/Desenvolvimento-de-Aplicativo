package Exercicio02;
import java.util.Scanner;
public class Exercicio03 {

	int valor;
	
	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		Exercicio03 e3 = new Exercicio03();
		
		System.out.println("Digite um Valor Inteiro: ");
		int valor = ler.nextInt();
		
		if(valor% 2==0) {
    		System.out.println("Par");
    	}else {
    		System.out.println("impar");
    	}
	}

}
