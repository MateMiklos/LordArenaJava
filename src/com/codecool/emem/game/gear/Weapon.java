package com.codecool.emem.game.gear;

public abstract class Weapon extends Gear {

    public Weapon(int attackBonus, int defenseBonus, int damageBonus, int armorBonus) {
        super(attackBonus, defenseBonus, damageBonus, armorBonus);
    }
}
