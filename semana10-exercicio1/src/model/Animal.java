package model;

public class Animal {
	private String nome;
	private float comprimento;
	private int numeroPatas;
	private String cor;
	private String ambiente;
	private float velocidadeMedia;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getComprimento() {
		return comprimento;
	}
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
	public int numeroPatas() {
		return numeroPatas;
		}
	public void setNumeroPatas (int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public float getVelocidade() {
		return velocidadeMedia;
	}
	public void setVelocidadeMedia (float velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}
	
	public Animal(String nome, float comprimento, int numeroPatas, String cor, 
			String ambiente, float velocidade) {
		this.nome = nome;
		this.ambiente = ambiente;
		this.comprimento = comprimento;
		this.cor = cor;
		this.numeroPatas = numeroPatas;
		this.velocidadeMedia= velocidade;
	
	}
	
	public String toString() {
		return "Animal= " + nome + ", comprimento=" + comprimento + ", numeroPatas=" + numeroPatas + ", cor=" + cor
				+ ", ambiente=" + ambiente + ", velocidadeMedia=" + velocidadeMedia ;
	}
	
}
