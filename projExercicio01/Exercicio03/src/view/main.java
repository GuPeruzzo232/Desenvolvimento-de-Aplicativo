package view;
import java.util.Scanner;
import model.Calcular;
public class main {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		Calcular cl = new Calcular();
		
		System.out.println("Digite um Valor real: ");
		cl.setA(ler.nextInt());
		System.out.println("O Dobro: " + cl.dobro());
		System.out.println("O triplo do dobro: " + cl.triploDoDobro());
		System.out.println("A metade do triplo do dobro: " + cl.metadeDoTriplo());
		System.out.println("Ao Quadrado: " + cl.quadrado());
		System.out.println("quinta parte do dobro: " + cl.quintaDobro());
	}

}
