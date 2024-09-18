package Entity;

public class Character {
	private String name;
	private double health;
	private double defense;
	private Weapon weapon;
	public Character(String name, double defense,Weapon weapon) {
		super();
		this.name = name;
		this.health = 1000;
		this.defense = defense;
		this.weapon=weapon;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHealth() {
		return health;
	}
	public void setHealth(double health) {
		this.health = health;
	}

	public double getDefense() {
		return defense;
	}
	public void setDefense(double defense) {
		this.defense = defense;
	}
	public Weapon getWeapon() {
		return weapon;
	}
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	
}
