package view;
import java.util.Scanner;
import model.Cliente;
public class main {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Cliente cl = new Cliente();
		
		System.out.println("Digite seu Nome: ");
		String Nome = ler.next();
		
		System.out.println("Digite Sua Idade: ");
		cl.setIdade(ler.nextInt());
		
		System.out.println("Digite sua renda: " );
		cl.setRenda(ler.nextDouble());
		System.out.println(cl.classificarIdade());
		System.out.println(cl.classificarRenda());
	}

}
