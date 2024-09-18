package Entity;

public class Player {
	private String name;
	private Character character;
	public Player(String name,Character character) {
		super();
		this.name=name;
		this.character = character;
	}
	public Character getCharacter() {
		return character;
	}
	public void setCharacter(Character character) {
		this.character = character;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
