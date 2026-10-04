package main;

import java.util.Date;
import java.text.SimpleDateFormat;
import model.Emprestimo;
import model.Exemplar;
import model.Livro;
import model.Usuario;

public class MAin {
	public static void main(String[] args) {
	try {
		Usuario usuario = new Usuario(); 
		usuario.nome = "Alesssandra R"; 
		usuario.CPF = 12547885;
		usuario.matricula = "1313";
		usuario.telefone = "61999976333";
		
		Livro livro = new Livro();
		livro.titulo = "Laranja mecânica";
		livro.autor = "Anthony Burgess";
		livro.edicao = 65;
		livro.ano = (int) 1962;
		livro.editora = "PBworks";
		livro.ISBN = "88232LJK";
	    
		Emprestimo emprestimo = new Emprestimo();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		emprestimo.setDataDeEmprestimo(sdf.parse("06/04/2026"));
		emprestimo.setDataDeEntregaReal(sdf.parse("06/06/2026"));
		emprestimo.setDataPrevistaDeDevolucao(sdf.parse("24/04/2026"));
		
		Exemplar exemplar = new Exemplar();
		exemplar.codigo = 14546;
		exemplar.cativa = true;
		exemplar.emprestada = true;
				
		
		System.out.println(usuario.toString());
		System.out.println(emprestimo.toString());
		System.out.println(livro.toString());
		System.out.println(exemplar.toString());
	  
	} catch (Exception e) {
         System.out.println("Erro ao converter as datas: " + e.getMessage());
    
    }
	}

}




