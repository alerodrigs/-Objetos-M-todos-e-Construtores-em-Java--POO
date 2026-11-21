package main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main_Questao5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		System.out.println("Digite um numero:");
		int numeroEscolhido = scan.nextInt();
		
		int contarRepeticoes = 0;
		
		for(int i = 0 ; i < 300 ; i++) {
			lista.add(new Random().nextInt(0,100));
			
			if(lista.get(i) == numeroEscolhido){
				contarRepeticoes++;
			}
		}
		
		System.out.println(lista);
		
		System.out.println("Repeticao: " + contarRepeticoes);
	}

}
