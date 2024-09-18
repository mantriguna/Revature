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
