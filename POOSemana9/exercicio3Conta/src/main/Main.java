package main;

import model.Conta;

public class Main {
	public static void main(String[] args) {
		System.out.println("Criação de contas:");
		Conta conta1 = new Conta(658744, 365.8, 5000.0, "Alessandra R");
		Conta conta2 = new Conta(445888, 745.5, 400, "Bruno B");
		Conta conta3 = new Conta(422631,85.9,800.5, "Cora C");
		System.out.println(conta1);
		System.out.println(conta2);
		System.out.println(conta3);
		
		System.out.println("Operações: ");
		conta2.depositar(75);
		System.out.println(conta2);
		
		conta1.sacar(400);
		System.out.println(conta1);
		
		conta3.transferir(80, conta1);
		System.out.println(conta3);
		System.out.println(conta1);
	}
}
