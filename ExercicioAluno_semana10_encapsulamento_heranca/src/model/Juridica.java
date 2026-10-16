package model;

public class Juridica extends Pessoa {
	private String CNPJ;
	
	public Juridica(String nome,String CNPJ) {
		super(nome);
		this.CNPJ = CNPJ;		
	}
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String CNPJ) {
		
		this.CNPJ = CNPJ;
	}	
	
	public boolean validarCNPJ() {
		if(this.CNPJ != null && this.CNPJ.replaceAll("\\D", "").length()==14) {
			return true;
		}
		return false;
	}
	
}
