package Entity;

public class Player {
	private String name;
	private Character character;
	private Weapon weapon;
	public Player(String name,Character character, Weapon weapon) {
		super();
		this.name=name;
		this.character = character;
		this.weapon = weapon;
	}
	public Character getCharacter() {
		return character;
	}
	public void setCharacter(Character character) {
		this.character = character;
	}
	public Weapon getWeapon() {
		return weapon;
	}
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
