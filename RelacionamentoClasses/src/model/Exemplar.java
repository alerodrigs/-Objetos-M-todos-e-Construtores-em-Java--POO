package model;

public class Exemplar {
	public int codigo;
	public boolean cativa;
	public boolean emprestada;
	public Livro livro;
	public Emprestimo emprestimo;
	
	public String toString() {
		return "Codigo: "+ codigo+" Cativa: "+cativa+" Emprestada: "+emprestada;
}
}
