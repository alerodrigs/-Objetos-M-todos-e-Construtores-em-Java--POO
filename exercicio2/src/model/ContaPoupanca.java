package model;

public class ContaPoupanca {
	public String agencia;
	public String operacao;
	public String conta;
	public Banco banco;
	
	public ContaPoupanca() {
		
	}
	
	public String toString() {
		return "ContaPoupanca [agencia=" + agencia + 
				", operacao=" + operacao + ", conta=" + conta + 
				", banco=" + banco
				+ "]";
	}
}
