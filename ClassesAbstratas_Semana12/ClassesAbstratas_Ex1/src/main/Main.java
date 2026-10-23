package main;

import model.Bimestre;
import model.EstudoDirigido;
import model.Prova;
import model.Seminario;

public class Main {

	public static void main(String[] args) {
	
		
		Prova prova = new Prova("Prova", 6.7, 35, 8, false );		
		Seminario seminario = new Seminario("Seminario", 5.9, "Historia do Brasil", 15);	
		EstudoDirigido estudoD = new EstudoDirigido("Estudo Dirigido", 8.9, "Plantas carnivoras", 6);
		
		Bimestre bimestre = new Bimestre("Primeiro bimestre", prova, seminario, estudoD);
		bimestre.imprimirAvaliacoes();

	}

}
