package view;
import java.util.Scanner;
import model.Calcular;
public class main {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		Calcular cl = new Calcular();
		
		System.out.println("Digite o V�lor do raio de uma circunfer�ncia: ");
		cl.setValor(ler.nextInt());
		System.out.println("Valor do Di�metro: " + cl.valorDiametro());
		System.out.println("Valor de 1 quadrante desta circunfer�ncia: " + cl.valorQuandrante());
	}
}
