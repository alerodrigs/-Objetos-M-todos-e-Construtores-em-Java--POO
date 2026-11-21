package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_Questao3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		for(int i= 0; i < 15; i++) {
			System.out.println("Digite um numero inteiro:");
			lista.add(scan.nextInt());
		}
		int soma = 0;
		
		for(int temp: lista) {
			 soma += temp;
			
		}
		System.out.println(soma/15);
	}

}
