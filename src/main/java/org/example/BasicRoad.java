package org.example;

public class BasicRoad extends Road {

	public BasicRoad(String name, String cityFrom, String cityTo) {
		// super chez une fille = this chez la mere
		super(name, cityFrom, cityTo);
	}

	public void enter() {
		System.out.println("Welcome to Road " + getName());
	}

}
