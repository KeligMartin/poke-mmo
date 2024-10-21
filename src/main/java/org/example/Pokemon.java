package org.example;
// org.example;

public class Pokemon implements IPokemon {

	private String name;

	private String type;

	private int level;

	private int hp;

	public Pokemon(String name, String type, int level, int hp) {
		this.name = name;
		this.type = type;
		this.level = level;
		this.hp = hp;
	}

	public Pokemon() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void attack(Pokemon pokemon) {
		int previousHp = pokemon.getHp();
		pokemon.setHp(previousHp - 10);
	}

	public void heal() {
		int previous = getHp();
		setHp(previous + 10);
	}

	public String toString() {
		return "Pokemon : " + name + " type : " + type + " niveau : " + level + " PDV : " + hp;
	}

}
