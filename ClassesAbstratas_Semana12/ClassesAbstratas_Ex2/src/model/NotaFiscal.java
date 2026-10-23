package model;

public class NotaFiscal {
	int numero;
	String resumo;
	Pagamento pagamento;

	public NotaFiscal(int numero, String resumo, Pagamento pagamento) {
		super();
		this.numero = numero;
		this.pagamento = pagamento;
		this.resumo = resumo;
	}

	public void imprimirNota() {
		System.out.println("Nota Fiscal Numero: " + numero);
		System.out.println("Resumo da compra:\n " + resumo);
		System.out.println("Forma de pagamento: " + pagamento.imprimir());

	}
}
