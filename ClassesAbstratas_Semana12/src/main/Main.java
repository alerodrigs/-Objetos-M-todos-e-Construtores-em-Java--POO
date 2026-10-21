package main;

import model.Assalariado;
import model.Comissionado;
import model.Horista;

public class Main {

	public static void main(String[] args) {
		Assalariado assalariado = new Assalariado("ale", "rod", "9292", 20000);
		
		System.out.println(assalariado);
		System.out.println(assalariado.vencimento());

		Comissionado comissionado = new Comissionado("Maria", "Deus", "2891", 2933, 0.39);
		System.out.println(comissionado);
		System.out.println(comissionado.vencimento());
		
		Horista horista = new Horista("Julia","rod","7320", 35, 6.7);
		System.out.println(horista);
		System.out.println(horista.vencimento());
		
	}

}
