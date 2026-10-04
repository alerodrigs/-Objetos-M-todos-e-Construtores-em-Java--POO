package model;

public class Emprestimo {
	public long id;
	public Livro livro;
	public Pessoa pessoa;
	public Date date;
	
	public Emprestimo() {
		
	}
	public String toString() {
		return " id: " + id;
	}
		
}
