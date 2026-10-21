package model;

public class Comissionado extends Empregado {
	
	private double totalVenda;
	private double taxaComissao;
	
	public Comissionado(String nome, String sobrenome, String cpf, double totalVenda, double taxaComissao) {
		super(nome, sobrenome, cpf);
		this.taxaComissao = taxaComissao;
		this.totalVenda = totalVenda;
	}

	@Override
	public double vencimento() {
		return totalVenda * taxaComissao;
	}
	
}
