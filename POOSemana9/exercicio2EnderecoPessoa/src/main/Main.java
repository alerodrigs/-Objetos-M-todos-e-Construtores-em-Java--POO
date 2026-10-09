package main;

import model.Endereco;
import model.Pessoa;

public class Main {

	public static void main(String[] args) {
		Endereco endereco = new Endereco("SQS",308,"casa","Asa Sul", "Brasília","4582258");
		
		Pessoa pessoa = new Pessoa("Alesssandra Rodrigues", "466666464800", endereco);

		System.out.println(endereco);
		System.out.println(pessoa);
	}

}
