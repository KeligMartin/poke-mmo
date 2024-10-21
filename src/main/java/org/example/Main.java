package org.example;

public class Main {

	public static void main(String[] args) {

		// Création avec un constructeur
		Pokemon pikachu = new Pokemon("Pikachu", "Electrique", 30, 10);

		// Création avec les setters
		Pokemon salameche = new Pokemon();
		salameche.setName("Salameche");
		salameche.setType("Feu");
		salameche.setLevel(15);
		salameche.setHp(100);
		pikachu.attack(salameche);

		// echo "Hello World";
		System.out.println(pikachu.toString());
		System.out.println(salameche.toString());
		salameche.attack(pikachu);
		pikachu.attack(salameche);
		System.out.println(salameche.toString());
		System.out.println(pikachu.toString());
		pikachu.heal();
		System.out.println(pikachu.toString());

		Road roadOne = new BasicRoad("Road 1", "Bourg-Palette", "Argenta");
		Road chenal = new Chenal("Chenal 123", "Bourg-Palette", "Cramoisile");

		roadOne.enter();
		chenal.enter();
	}
}