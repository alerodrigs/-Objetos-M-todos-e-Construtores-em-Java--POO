package model;

public class Seminario extends Avaliacao{
	private String tema;
	private double tempoDuracao;
	
	public Seminario(String nome, double nota,String tema, double tempoDuracao) {
		super(nome, nota);
		this.tema = tema;
		this.tempoDuracao = tempoDuracao;
		
		
	}

	@Override
	public String toString() {
		return "Seminario [tema=" + tema + ", tempoDuracao=" + tempoDuracao + "]";
	}

}
