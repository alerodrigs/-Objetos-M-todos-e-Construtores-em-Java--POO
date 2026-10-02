package model;
//exemplos de metodos construtores//

public class Usuario {
	public String nome;
	public String senha;
	public String confirmeSuaSenha;
	
	public Usuario() { //nesse tipo de metodo é bom usar no caso se tiver varias valorações//
	}
	public Usuario(String nome, String senha, String confirmeSuaSenha) {
		this.nome = nome;
		this.senha = senha;
		this.confirmeSuaSenha = confirmeSuaSenha;	
	}
}
