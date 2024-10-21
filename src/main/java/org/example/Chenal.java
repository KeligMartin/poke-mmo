package org.example;

public class Chenal extends Road {

	public Chenal(String name, String cityFrom, String cityTo) {
		super(name, cityFrom, cityTo);
	}

	public void enter() {
		System.out.println("Welcome to Chenal " + getName());
	}


}
