package model;

public class PagamentoEmDinheiro extends Pagamento {

	private double valorRecebido;
	private double troco;
	
	public PagamentoEmDinheiro(double valor, double valorRecebido, double troco) {
		super(valor);
		this.troco = troco;
		this.valorRecebido = valorRecebido;
		
	}
	
	
	@Override
	public String imprimir() {		
		return "PagamentoEmDinheiro [valorRecebido=" + valorRecebido + ", troco=" + troco + "]";
	}
}
