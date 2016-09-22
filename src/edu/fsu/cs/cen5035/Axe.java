package edu.fsu.cs.cen5035;

/**
 * 
 * @author Raghunath
 *
 */
public class Axe extends BasicWeapon implements Weapon{

	public Axe() {
		super(60);
	}

	@Override
	public int hit() {
		return DAMAGE;
	}

	@Override
	public int hit(int armor) {
		int damage;
		if(armor>0 && armor<20){
			damage = DAMAGE;
		}
		else {
			damage = DAMAGE - armor;
		}
		if (damage<0) {
			return 0;
		}
		return damage;
	}
	

}
