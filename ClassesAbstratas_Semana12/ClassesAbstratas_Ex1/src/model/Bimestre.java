package model;

public class Bimestre {
	private String bimestre;
	private Avaliacao av1;
	private Avaliacao av2;
	private Avaliacao av3;
	
	public Bimestre(String bimestre, Avaliacao av1, Avaliacao av2, Avaliacao av3) {
		this.av1 = av1;
		this.av2 = av2;
		this.av3 = av3;
		this.bimestre = bimestre;
	}
	
	public void imprimirAvaliacoes() {
		System.out.println(this.av1 );
		System.out.println(this.av2 );
		System.out.println(this.av3 );
		System.out.println(this.bimestre);
	}
}
