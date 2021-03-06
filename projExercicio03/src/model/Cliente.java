package model;
import java.util.Scanner;
public class Cliente {
	
	private String nome;
	private int idade;
	private double renda;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getRenda() {
		return renda;
	}
	public void setRenda(double renda) {
		this.renda = renda;
	}
	
	@Override
	public String toString() {
		return  "Nome =" + nome + 
				"Idade=" + idade + 
				"Renda=" + renda;
	}
	
	public String classificarIdade() {
		if(this.idade >= 18) {
			return "Maior de idade";
		}else {
			return "Menor de idade";
		}
	}
	
	public String classificarRenda() {
		if(this.renda >= 15000) {
			return "Cliente Rico";
		}else {
			return "Cliente Não é rico";
		}
	}
	
	
	
}
