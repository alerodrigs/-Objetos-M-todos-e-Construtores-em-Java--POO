package model;

public class Fisica extends Pessoa {
	private String CPF;
	
	public Fisica(String nome, String CPF) {
		super(nome);
		this.CPF = CPF;
	}
	
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	
	public boolean validarCPF() {
		if(this.CPF !=null && this.CPF.replaceAll("\\D", "").length() == 11) {
			return true;
		}
		return false;
	}
}
