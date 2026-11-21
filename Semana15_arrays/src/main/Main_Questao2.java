package main;

import java.util.ArrayList;
import java.util.Scanner;

import model.Aluno;

public class Main_Questao2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			
		ArrayList<Aluno> list = new ArrayList<Aluno>();
			
		for (int i= 0; i < 4; i++) {
			Aluno aluno = new Aluno();
			scan = new Scanner(System.in);
			
			
			System.out.println("Digite seu nome:");
			aluno.setNome(scan.nextLine());
			
			scan = new Scanner(System.in);
			
			System.out.println("Digite a nota do 1 bimestre:");
			aluno.setNota1Bimestre(scan.nextFloat());
			
			System.out.println("Digite a nota do 2 bimestre:");
			aluno.setNota2Bimestre(scan.nextFloat());

			list.add(aluno);
			}
		for (Aluno aluno : list) {
			System.out.println(aluno.getNome());
			System.out.println(aluno.getNota1Bimestre());
			System.out.println(aluno.getNota2Bimestre());
		}
		}

}
