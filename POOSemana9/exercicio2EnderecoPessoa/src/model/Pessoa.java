package model;

public class Pessoa {
	public String nome;
	public String CPF;
	public Endereco endereco;
	
	public Pessoa() {
		
	}
	public Pessoa(String nome, String CPF, Endereco endereco) {
		this.CPF = CPF;
		this.nome = nome;
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", CPF=" + CPF + ","  + endereco + "]";
	}
}
