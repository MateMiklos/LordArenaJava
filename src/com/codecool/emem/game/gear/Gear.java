package com.codecool.emem.game.gear;

public abstract class Gear {

    protected int attackBonus;
    protected int defenseBonus;
    protected int damageBonus;
    protected int armorBonus;
    protected GearAttributes gearAttributes;

    public Gear(GearAttributes gearAttributes) {
        this.gearAttributes = gearAttributes;
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
