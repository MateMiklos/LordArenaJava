package com.codecool.emem.game.gear;

public abstract class Gear {
    protected int attackBonus;
    protected int defenseBonus;
    protected int damageBonus;
    protected int armorBonus;

    public Gear(int attackBonus, int defenseBonus, int damageBonus, int armorBonus) {
        this.attackBonus = attackBonus;
        this.defenseBonus = defenseBonus;
        this.damageBonus = damageBonus;
        this.armorBonus = armorBonus;
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
