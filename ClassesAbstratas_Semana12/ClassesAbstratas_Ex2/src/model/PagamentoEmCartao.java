package model;

public class PagamentoEmCartao extends Pagamento {

	private String bandeira;
	private long numeroTransacao;
	
	public PagamentoEmCartao(double valor, String bandeira, long numeroTransacao) {
		super(valor);
		this.bandeira = bandeira;
		this.numeroTransacao = numeroTransacao;
		
	}
	
	@Override
	public String imprimir() {
		return "PagamentoEmCartao [bandeira=" + bandeira + ", numeroTransacao=" + numeroTransacao + "]";
	}

}
