package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_Questao1B {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		for(int i = 0; i < 8; i++) {
			System.out.println("Digite um numero negativo ou positivo:");
			lista.add(scan.nextInt());
		}
		int soma = 0;
		for(int temp: lista) {
			if(temp < 0) {
				System.out.println(temp);
			}
			else {
				soma += temp;
			}
		}
		System.out.println(soma);
	}

}
