package com.codecool.emem.game.gear;

public enum WeaponAttributes {

    TWO_HANDED_SWORD(7, 2, 2, 0),
    ONE_HANDED_SWORD(6,1,1,0),
    TWO_HANDED_AXE(10,1,3,0),
    ONE_HANDED_AXE(8,0,2,0),
    TWO_HANDED_HAMMER(12,1,1,0)
    ;

    private int attackBonus;
    private int defenseBonus;
    private int damageBonus;
    private int armorBonus;

    WeaponAttributes(int attackBonus, int defenseBonus, int damageBonus, int armorBonus) {
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
