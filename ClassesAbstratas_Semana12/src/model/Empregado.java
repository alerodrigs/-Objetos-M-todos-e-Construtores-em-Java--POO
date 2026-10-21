package model;

public abstract class Empregado {
	private String nome;
	private String sobrenome;
	private String cpf;
	
	protected Empregado(String nome, String sobrenome, String cpf) {
		this.cpf = cpf;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	public abstract double vencimento();
	@Override
	public String toString() {
		return "Empregado [nome=" + nome + ", sobrenome=" + sobrenome + ", cpf=" + cpf + "]";
	}
	

}
