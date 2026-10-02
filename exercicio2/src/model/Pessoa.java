package model;

public class Pessoa {
	public String nome;
	public String CPF;
	public ContaPoupanca contaPoupanca;
	
	public Pessoa() {
		
	}
	
	public String toString() {
		return "nome: " + nome + " CPF: " + CPF + " " + contaPoupanca;
	}
}
