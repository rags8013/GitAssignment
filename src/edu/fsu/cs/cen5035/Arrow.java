package edu.fsu.cs.cen5035;

/**
 * 
 * @author Raghunath
 *
 */
public class Arrow extends BasicWeapon implements Weapon{

	public Arrow() {
		super(70);
	}

	@Override
	public int hit() {
		return DAMAGE;
	}

	@Override
	public int hit(int armor) {
		int ignoredArmor = 5;
		int actualArmor = armor - ignoredArmor;
		int damage = DAMAGE - actualArmor;
		if(damage < 0){
			return 0;
		}
		return damage;
	}

}
