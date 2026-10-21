package model;

public class Horista extends Empregado {

	private double precoHora;
	private double horaTrab;
	
	public Horista(String nome, String sobrenome, String cpf, double precoHora, double horaTrab) {
		super(nome, sobrenome, cpf);
		this.precoHora = precoHora;
		this.horaTrab = horaTrab;
	}

	@Override
	public double vencimento() {
		return precoHora * horaTrab;
	}
		
}
