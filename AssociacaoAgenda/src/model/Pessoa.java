package model;

public class Pessoa {
	public String nome;
	public String sobrenome;
	public String dataNascimento;
	public Contato contato;
	public Endereco endereco;
	
	public void imprimir() {
		System.out.println("Pessoa: "+ nome + " " + sobrenome);
		System.out.println("Data de nascimento: "+ dataNascimento);
	}
}
