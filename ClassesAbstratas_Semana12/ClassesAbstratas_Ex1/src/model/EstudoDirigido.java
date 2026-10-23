package model;

public class EstudoDirigido extends Avaliacao {

	private String tema;
	private int numeroPaginas;
	
	public EstudoDirigido(String nome, double nota, String tema, int numeroPaginas) {
		super(nome, nota);
		this.numeroPaginas = numeroPaginas;
		this.tema = tema;
	}

	@Override
	public String toString() {
		return super.toString() + 
				"[tema=" + tema + ", "
						+ "numeroPaginas=" + numeroPaginas + "]";
	}
	

}
