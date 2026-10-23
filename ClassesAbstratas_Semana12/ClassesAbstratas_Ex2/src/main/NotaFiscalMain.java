package main;

import model.NotaFiscal;
import model.PagamentoEmCartao;
import model.PagamentoEmDinheiro;

public class NotaFiscalMain {

	public static void main(String[] args) {
		PagamentoEmDinheiro pagDin = new PagamentoEmDinheiro(39.55, 40.00, 0.55);	
		PagamentoEmCartao pagCartao = new PagamentoEmCartao(155.40, "Visa", 15468);
		
		
		NotaFiscal n = new NotaFiscal(100, "Automação de carro", pagDin);
		n.imprimirNota();
		
		NotaFiscal n2 = new NotaFiscal(102, "Prova resistencia", pagCartao);
		n2.imprimirNota();
	}

}
