package model;

public class Calcular {
	
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "Calcular a = " + a;
	}
	
	public int dobro() {
		return a*2;
	}
	public int triploDoDobro() {
		return dobro()*3;
	}
	public int metadeDoTriplo() {	
		return triploDoDobro()/2;
	}
	public int quadrado() {
		return (int) Math.pow(a, 2);
	}
	public int quintaDobro() {
		return dobro()/5;
	}
}
