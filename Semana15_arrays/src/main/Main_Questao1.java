package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_Questao1 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i=0; i < 10; i++) {
			System.out.println("Digite um numero:");
			list.add(scan.nextInt());
		}
		
		for(int temp : list) {
			if(temp < 40) {
				System.out.println(temp);
			}
		}
		
	}
}
