package model;

public class Endereco {
	public String logradouro;
	public String CEP;
	public String numero;
	public String complemento;
	public String cidade;
	
	public void imprimir() {
		System.out.println("Logradouro: "+ logradouro);
		System.out.println("CEP: "+ CEP);
		System.out.println("Numero:"+ numero);
		System.out.println("Complemento: "+ complemento);
		System.out.println("Cidade: "+ cidade);
	}
}
