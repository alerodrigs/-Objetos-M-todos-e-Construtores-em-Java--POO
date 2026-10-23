package main;

import model.Calculadora;

public class CalculadoraMain {

	public static void main(String[] args) {
		System.out.println("Operações de soma: ");
		Calculadora.Soma(10, 8);
		Calculadora.Soma(16, 130, 50);

		System.out.println("Operações de subtração: ");
		Calculadora.Subtrair(60, 7);
		Calculadora.Subtrair(4, 2, 1);
		
		System.out.println("Operações de multiplicação: ");
		Calculadora.Multiplicar(20, 4);
		Calculadora.Multiplicar(3, 5, 100);
		
		System.out.println("Operações de divisão: ");
		Calculadora.Dividir(80, 3);
		Calculadora.Dividir(40, 6, 2);
	}

}
