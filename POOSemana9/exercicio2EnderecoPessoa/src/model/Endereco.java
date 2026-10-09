package model;

public class Endereco {
	public String logradouro;
	public int numero;
	public String complemento;
	public String bairro;
	public String cidade;
	public String CEP;
	
	public Endereco() {
	}
	public Endereco(String logradouro, int numero, String complemento,String bairro, String cidade,
			String CEP) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.CEP = CEP;
		}
	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", numero=" + numero + ", complemento=" + complemento
				+ ", bairro=" + bairro + ", cidade=" + cidade + ", CEP=" + CEP + "]";
	}
	
}
