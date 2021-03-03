package view;
import java.util.Scanner;
import model.Calcular;
public class main {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		Calcular cl = new Calcular();
		
		System.out.println("Digite seu nome: ");
		cl.setNome((ler.next()));
		System.out.println("Digite sua Primeira Nota: ");
		cl.setN1((ler.nextDouble()));
		System.out.println("Digite sua Segunda Nota: ");
		cl.setN2((ler.nextDouble()));
		System.out.println("Digite sua Terceira Nota: ");
		cl.setN3((ler.nextDouble()));
		System.out.println(cl);
		System.out.println("Média aritmética: " + cl.calcularAritimedia());
	}

}
