package Service;

import Entity.Player;

public class Rules {

	public void attack(Player attacker,Player defender) {
		double weaponpower=attacker.getCharacter().getWeapon().getAttackPower();
		double defence=defender.getCharacter().getDefense();
		double defender_health=defender.getCharacter().getHealth();
		double total=defender_health-(weaponpower-defence);
		defender.getCharacter().setHealth(total);
	}
}
/*Enter Player 1 Name: guna
Enter Player 2 Name: aryan
Hello, guna
Enter your character name: doraemon
Enter your character defense power: 5
Enter your Weapon name: shotgun
Enter your Weapon attack power: 7
Hello, aryan
Enter your character name: nobita
Enter your character defense power: 2
Enter your Weapon name: crying
Enter your Weapon attack power: 7
Players have been created successfully....
Welcome, TO the Battle Arena Game 
Player 1: guna
Player 2: aryan
Enter Who attacks Firsts (guna as 1 oraryan as 2):1*/