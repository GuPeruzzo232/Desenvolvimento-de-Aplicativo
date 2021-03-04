package model;

public class Calcular {
	
	 private String Nome;
	 private double n1,n2,n3;
	 

	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	public double getN3() {
		return n3;
	}
	public void setN3(double n3) {
		this.n3 = n3;
	}
	
	@Override
	public String toString() {
		return  "Nome: " + Nome + 
			    "\nN1: " + n1 + 
				"\nN2: " + n2 + 
				"\nN3: " + n3 ; 
				
	
	}
	
	public double calcularAritimedia() {
		return (n1+n2+n3)/3;
	}

}
