package com.codecool.emem.game.gear;

public class MeleeWeapon extends Weapon {

    private String weaponType;
    private int numberOfHands;

    public MeleeWeapon(int attackBonus, int defenseBonus, int damageBonus, int armorBonus,
                       String weaponType, int numberOfHands) {
        super(attackBonus, defenseBonus, damageBonus, armorBonus);
        this.weaponType = weaponType;
        this.numberOfHands = numberOfHands;
    }
}
