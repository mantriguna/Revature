package Entity;

public class Weapon {
	private String Weaponname;
	private double attackPower;
	public Weapon(String weaponname, double attackPower) {
		super();
		Weaponname = weaponname;
		this.attackPower = attackPower;
	}
	public String getWeaponname() {
		return Weaponname;
	}
	public void setWeaponname(String weaponname) {
		Weaponname = weaponname;
	}
	public double getAttackPower() {
		return attackPower;
	}
	public void setAttackPower(double attackPower) {
		this.attackPower = attackPower;
	}
}
