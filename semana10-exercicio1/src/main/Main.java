package main;

import model.Animal;
import model.Peixe;

public class Main {

	public static void main(String[] args) {
		Animal animal = new Animal("cachorro", 30, 4, "preto", "terrestre", 20);
		animal.setComprimento(35);
		System.out.println(animal.toString());
	
		Peixe peixe = new Peixe("Tucunare", 20, 0, "verde","aquatico", 40,"Barbatana pequena");
		System.out.println(peixe.toString());
	
	}

}
