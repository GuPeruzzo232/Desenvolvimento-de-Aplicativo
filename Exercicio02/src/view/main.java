package view;
import java.util.Scanner;
import model.Calcular;
public class main {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		Calcular cl = new Calcular();
		
		System.out.println("Digite o Válor do raio de uma circunferência: ");
		cl.setValor(ler.nextInt());
		System.out.println("Valor do Diâmetro: " + cl.valorDiametro());
		System.out.println("Valor de 1 quadrante desta circunferência: " + cl.valorQuandrante());
	}
}
