package model;


public class Livro {
	public String titulo;
	public String autor;
	public int ano;
	public int edicao;
	public String editora;
	public String ISBN;
	
	public String toString() {
		return "Título: "+titulo+ " Autor: "+autor+" Ano: "+ano+" Edição: "+edicao+ " Editora: "+
	    editora + " ISBN: "+ISBN;
}
}

