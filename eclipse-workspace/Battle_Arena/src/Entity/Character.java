package Entity;

public class Character {
	private String name;
	private double health;
	private double attack_power;
	private double defense;
	private Weapon weapon;
	public Character(String name, double health, double attack_power, double defense,Weapon weapon) {
		super();
		this.name = name;
		this.health = health;
		this.attack_power = attack_power;
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
	public double getAttack_power() {
		return attack_power;
	}
	public void setAttack_power(double attack_power) {
		this.attack_power = attack_power;
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
