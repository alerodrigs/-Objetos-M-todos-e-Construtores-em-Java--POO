package main;

import model.Calculadora;

public class Main {

	public static void main(String[] args) {
		System.out.println("Testando os diferentes métodos: ");
		Calculadora cal1 = new Calculadora(25.4,99.0,4.0);
		Calculadora cal2 = new Calculadora(66.5,42.8);
		Calculadora cal3 = new Calculadora(30.0);
		Calculadora cal4 = new Calculadora();	 	
		
		System.out.println(cal1);
		System.out.println(cal2);
		System.out.println(cal3);
		System.out.println(cal4);	
		}

	}


