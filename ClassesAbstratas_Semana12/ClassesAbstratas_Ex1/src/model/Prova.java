package model;

public class Prova extends Avaliacao {

	private double TempoDuracao;
	private int QuantidadeDeQuestoes;
	private boolean ConsultaAutorizada;
	
	public Prova(String nome, double nota, double TempoDuracao, 
			int QuantidadeDeQuestoes, boolean ConsultaAutorizada) {
		super(nome, nota);
		this.ConsultaAutorizada = ConsultaAutorizada;
		this.QuantidadeDeQuestoes = QuantidadeDeQuestoes;
		this.TempoDuracao = TempoDuracao;
		
		
	}

	@Override
	public String toString() {
		return "Prova [TempoDuracao=" + TempoDuracao + ", QuantidadeDeQuestoes=" + QuantidadeDeQuestoes
				+ ", ConsultaAutorizada=" + ConsultaAutorizada + "]";
	}

}
