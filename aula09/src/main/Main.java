package main;

import model.Usuario;
import util.Util;

public class Main {

	public static void main(String[] args) {
		Util util = new Util();
		
		util.maior(9, 4);
		util.maior(5, 10, 3);
		
		util.somar(5, 10);
		util.subtrair(8, 4);
		util.dividir(10, 2);
		util.multiplicar(9, 55);
		
		
		util.somar(5, 10, 3);
		util.subtrair(88, 44, 22);
		util.dividir(90, 10, 3);
		util.maior(2, 3, 4);
	
		String nomeCompleto = util.concatenar("Alessandra", "Rodrigues");
		System.out.println(nomeCompleto);
		
		String frase = util.frase("Olá mundo");
		System.out.println(frase);
		
		Usuario usuario = new Usuario();
		usuario.nome = "alesaososo";
		usuario.senha = "123455";
		usuario.confirmeSuaSenha = "123455";
		
		Usuario usuario2 = new Usuario("alesaososo","123455","123455");
				
	}

}
