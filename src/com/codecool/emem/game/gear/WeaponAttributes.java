package com.codecool.emem.game.gear;

public enum WeaponAttributes {

    // MELEE WEAPONS
    TWO_HANDED_SWORD(7, 3, 2, 0,1),
    ONE_HANDED_SWORD(6,2,1,0,1),
    TWO_HANDED_AXE(10,2,3,0,1),
    ONE_HANDED_AXE(8,1,2,0,1),
    TWO_HANDED_HAMMER(12,2,1,0,1),
    ONE_HANDED_HAMMER(10,1,1,0,1),
    DAGGER(5,0,1,0,1),
    SHIELD(0,7,0,1,1),
    STAFF(5,3,0,0,1),
    // RANGED WEAPONS
    LONGBOW(0,1,3,0,10),
    SHORTBOW(0,1,4,0,7),
    CROSSBOW(0,0,5,0,6),
    ;

    private int attackBonus;
    private int defenseBonus;
    private int damageBonus;
    private int armorBonus;
    private int range;

    WeaponAttributes(int attackBonus, int defenseBonus, int damageBonus, int armorBonus, int range) {
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

    public int getRange() {
        return range;
    }
}
