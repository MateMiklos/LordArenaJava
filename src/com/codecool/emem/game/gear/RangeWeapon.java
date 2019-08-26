package com.codecool.emem.game.gear;

public class RangeWeapon extends Weapon {

    private String weaponType;
    private int numberOfHands;

    public RangeWeapon(int attackBonus, int defenseBonus, int damageBonus, int armorBonus) {
        super(attackBonus, defenseBonus, damageBonus, armorBonus);
    }
}
