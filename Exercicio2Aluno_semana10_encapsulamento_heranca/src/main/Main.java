package main;

import model.PessoaFisica;
import model.PessoaJuridica;

public class Main {
	public static void main(String[] args) {
		PessoaFisica pf = new PessoaFisica("Ale Rod", 446546);
		pf.getNome();
		System.out.println("CPF: "+ pf.getCPF());
		
		PessoaJuridica pj = new PessoaJuridica("Resolde", 45477);
		pj.getNome();
		System.out.println("CNPJ: "+ pj.getCnpj());
	}
}
