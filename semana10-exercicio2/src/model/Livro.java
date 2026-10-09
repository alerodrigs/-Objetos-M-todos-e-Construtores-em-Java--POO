package model;

public class Livro {
	private String titulo;
	private int qtdPaginas;
	private int paginasLidas;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getQtdPaginas() {
		return qtdPaginas;
	}
	public void setQtdPaginas(int qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}
	public int getPaginasLidas() {
		return paginasLidas;
	}
	public void setPaginasLidas(int paginasLidas) {
		this.paginasLidas = paginasLidas;
	}
		
	public Livro(String titulo, int qtdPaginas, int paginasLidas) {
		this.titulo = titulo;
		this.paginasLidas = paginasLidas;
		this.qtdPaginas = qtdPaginas;
		}
	public Livro(String titulo) {
		this.titulo = titulo;
		this.paginasLidas = 0;
		this.qtdPaginas = 0;
	}
	public void verificarProgresso() {
		 float porcentagem = paginasLidas * 100 / qtdPaginas;
		 System.out.println("Você já leu " + porcentagem + " por cento do livro");
	}
	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", qtdPaginas=" + qtdPaginas + ", paginasLidas=" + paginasLidas + "]";
	}
	
}
