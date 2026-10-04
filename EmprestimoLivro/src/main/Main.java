package main;

import model.Date;
import model.Emprestimo;
import model.Livro;
import model.Pessoa;

public class Main {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.id = 2302258732L;
		pessoa.nome = "Alessandra Rodrigues";
		
		Emprestimo emprestimo = new Emprestimo();
		emprestimo.id = 24437292L;
		emprestimo.pessoa = pessoa;
				
		Date date = new Date();
		date.dataDevolucao =  "29/05/2026";
		date.dataEmprestimo =  "04/05/2026";
				
		Livro livro = new Livro();
		livro.titulo = "A república das milícias";
		livro.autor = "Bruno Paes Manso";
		livro.emprestado = true;
		livro.id = 26655889L;
		
		System.out.println(pessoa.toString());
		System.out.println(livro.toString());
		System.out.println(emprestimo.toString());
		System.out.println(date.toString());
					
		}
	}

