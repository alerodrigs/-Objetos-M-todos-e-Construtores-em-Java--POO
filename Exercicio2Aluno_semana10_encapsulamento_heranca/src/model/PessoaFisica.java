package model;

public class PessoaFisica extends Pessoa{
	private int CPF;
	
	public PessoaFisica(String nome, int CPF) {
		super(nome);
		this.CPF = CPF;
	}
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int val ) {
		this.CPF = val;
	}
	
	@Override
	public String getNome() {
		System.out.println("NOme: "+ super.getNome());
		return super.getNome();
	}
	@Override
	public void setNome(String nome) {
		super.setNome(nome);
	}
	
}
