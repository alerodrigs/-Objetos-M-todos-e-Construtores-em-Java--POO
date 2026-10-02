package main;

import model.Banco;
import model.ContaPoupanca;
import model.Pessoa;

public class Main {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.nome = "jesuis dasilva";
		pessoa.CPF = "66666666";
		
	
		ContaPoupanca contapoupanca = new ContaPoupanca();
		contapoupanca.agencia = "4455777";
		contapoupanca.conta = "NA";
		contapoupanca.operacao = "Agiotagem";
		
		Banco banco = new Banco();
		banco.CNPJ = "12346577";
		banco.nome = "Jesus salva";
		
		System.out.println(pessoa.toString());
		System.out.println(contapoupanca.toString());
		System.out.println(banco.toString());
	}

}
