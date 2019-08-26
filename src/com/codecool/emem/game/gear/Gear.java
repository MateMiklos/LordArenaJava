package com.codecool.emem.game.gear;

public abstract class Gear {
    protected int attackBonus;
    protected int defenseBonus;
    protected int damageBonus;
    protected int armorBonus;
    protected WeaponAttributes weaponAttributes;

    public Gear(WeaponAttributes weaponAttributes) {
        this.weaponAttributes = weaponAttributes;
    }

    public int getAttackBonus() {
        return attackBonus;
    }

    public int getDefenseBonus() {
        return defenseBonus;
    }

    public int getDamageBonus() {
        return damageBonus;
    }

    public int getArmorBonus() {
        return armorBonus;
    }
}
