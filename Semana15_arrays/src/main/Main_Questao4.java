package main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main_Questao4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> lista = new ArrayList<Integer>();

		for(int i= 0; i< 100; i++) {
			lista.add(new Random().nextInt(0, 100));
		}
		System.out.println(lista);
	}

}
