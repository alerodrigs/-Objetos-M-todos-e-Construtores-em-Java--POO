package model;

public abstract class Pagamento {
	private double valor;
	
	protected Pagamento(double valor) {
		this.valor = valor;
	}
		
	public abstract String imprimir();

	@Override
	public String toString() {
		return "Pagamento [valor=" + valor + "]";
	}
	
}
