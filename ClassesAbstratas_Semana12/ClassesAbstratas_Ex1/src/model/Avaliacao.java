package model;

public abstract class Avaliacao {
	private String nome;
	private double nota;
	
	public Avaliacao(String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
	}

	public double getNota() {
		return nota;
	}

	public String getInfo() {
		return nome;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
			
	@Override
	public String toString() {
		return "Avaliacao [nome=" + nome + ", nota=" + nota + "]";
	}
	
	
}
