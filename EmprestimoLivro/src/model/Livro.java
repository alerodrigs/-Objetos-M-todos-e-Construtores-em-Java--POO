package model;

public class Livro {
	public long id;
	public String titulo;
	public String autor;
	public boolean emprestado;
	
	public Livro() {
		
	}
	
	
	public String toString(){
		return "Título: "+ titulo + " Autor: "+ autor + " Emprestado: " + emprestado;
	}
}
