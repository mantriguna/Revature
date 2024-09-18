package Service;

import Entity.Player;

public class Rules {

	public void attack(Player attacker,Player defender) {
		double attackpower=attacker.getCharacter().getAttack_power();
		double weaponpower=attacker.getWeapon().getAttackPower();
		double defence=defender.getCharacter().getDefense();
		double defender_health=defender.getCharacter().getHealth();
		double total=defender_health-(attackpower+weaponpower-defence);
		defender.getCharacter().setHealth(total);
	}
}
