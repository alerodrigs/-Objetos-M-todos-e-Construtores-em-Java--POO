package main;

import model.Contato;
import model.Endereco;
import model.Pessoa;

public class Main {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.nome = "Alessandra";
		pessoa.sobrenome = "Rodrigues";
		pessoa.dataNascimento = "29/12/1997";
		
		pessoa.contato = new Contato();
		pessoa.contato.telefone = "(61)999985524";
		pessoa.contato.email = "ale.souzarod@gmail.com";
		pessoa.contato.descricao = "Filha da Jany";

		pessoa.endereco = new Endereco();
		pessoa.endereco.logradouro = "SCHES 909 BL E";
		pessoa.endereco.CEP = "23948439";
		pessoa.endereco.numero = "103";
		pessoa.endereco.complemento = "N/A";
		pessoa.endereco.cidade = "Brasília";
		
		pessoa.imprimir();
		System.out.println("Contato:");
		pessoa.contato.imprimir();
		System.out.println("Endereço:");
		pessoa.endereco.imprimir();
	}
}
