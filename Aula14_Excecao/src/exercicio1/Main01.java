package exercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		//int[] numeros = {0, 1}; //utilizado para valores fixos, capacidade limitada//
		Scanner scan = new Scanner(System.in);
		
		try {
			int[] numeros = new int[10];
			numeros[0] = 1;
			numeros[1] = 10;
			numeros[2] = Integer.parseInt("2.58");
			numeros[3] = 19;
			numeros[4] = 5;
			numeros[5] = 58;
			numeros[6] = 43;
			numeros[7] = 8;
			numeros[8] = 80;
			numeros[9] = 9;
			numeros[10]= 568;
			
			
			
			System.out.println(numeros[0]);
			System.out.println(numeros[1]);
			System.out.println(numeros[2]);
		}
		//catch (InputMismatchException e) {//
			//System.out.println("Valor digitado inválido");//
		//}	utilizado quando o usuario digita uma letra ao inves de numero//
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro técnico encontrado, informe o administrador do sistema");
	}
		catch (NumberFormatException e) {
			System.out.println("O número só pode ser inteiro.");
	}
}
}