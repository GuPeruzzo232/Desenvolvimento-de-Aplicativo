package model;

public class Calcular {
	
	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Calcular valor = " + valor ;
	}
	
	public int valorDiametro() {
		return valor * 2;
	}
	
	public int valorQuandrante() {
		return (valorDiametro()/4);
	}

}
