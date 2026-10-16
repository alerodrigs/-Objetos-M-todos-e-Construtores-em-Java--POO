package main;

import model.Fisica;
import model.Juridica;


public class Main {
	public static void main(String[] args) {
		Fisica pessoaFisica = new Fisica("Alessandra R", "12548877455");
		pessoaFisica.escreverNome();
		System.out.println("CPF "+ pessoaFisica.getCPF());
		System.out.println("O CPF é valido? " + pessoaFisica.validarCPF());
		
		Juridica pessoaJuridica = new Juridica("Escola Aprender","145-78544-444444");
		pessoaJuridica.escreverNome();
		
		System.out.println("CNPJ: " + pessoaJuridica.getCNPJ());
		
		pessoaJuridica.setCNPJ("75656564646464");
		
		System.out.println("CNPJ: " + pessoaJuridica.getCNPJ());

		System.out.println("CNPJ é válido?: " + pessoaJuridica.validarCNPJ());
		
	}
}
