package model;

public class Contato {
	public String telefone;
	public String email;
	public String descricao;
	public Endereco endereco;
	
	public void imprimir() {
		System.out.println("Telefone: " + telefone);
		System.out.println("Email: "+ email);
		System.out.println("Descrição: "+ descricao);
		
	}
}
