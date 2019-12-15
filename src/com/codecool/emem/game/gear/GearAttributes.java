package com.codecool.emem.game.gear;

public enum GearAttributes {

    // MELEE WEAPONS
    TWO_HANDED_SWORD(7,3,2,0,1, "two-handed"),
    ONE_HANDED_SWORD(6,2,1,0,1, "main-hand"),
    TWO_HANDED_AXE(10,2,3,0,1, "two-handed"),
    ONE_HANDED_AXE(8,1,2,0,1, "main-hand"),
    TWO_HANDED_HAMMER(12,2,1,0,1, "two-handed"),
    ONE_HANDED_HAMMER(10,1,1,0,1, "main-hand"),
    DAGGER(5,0,1,0,1, "main-hand"),
    SHIELD(0,7,0,1,1, "off-hand"),
    STAFF(5,3,0,0,1, "two-handed"),
    // RANGED WEAPONS
    LONGBOW(0,1,3,0,10, "two-handed"),
    SHORTBOW(0,1,4,0,7, "two-handed"),
    CROSSBOW(0,0,4,0,5, "two-handed"),
    // ARMOR
    LIGHT_HEAD_ARMOR(0,0,0,0,0,"head"),
    LIGHT_TORSO_ARMOR(0,0,0,1,0,"torso"),
    LIGHT_ARMS_ARMOR(0,0,0,0,0,"arms"),
    LIGHT_LEGS_ARMOR(0,0,0,1,0,"legs"),
    MEDIUM_HEAD_ARMOR(0,0,0,2,0,"head"),
    MEDIUM_TORSO_ARMOR(0,0,0,3,0,"torso"),
    MEDIUM_ARMS_ARMOR(0,3,0,1,0,"arms"),
    MEDIUM_LEGS_ARMOR(0,2,0,1,0,"legs"),
    HEAVY_HEAD_ARMOR(0,0,0,3,0,"head"),
    HEAVY_TORSO_ARMOR(0,0,0,4,0,"torso"),
    HEAVY_ARMS_ARMOR(2,6,1,2,0,"arms"),
    HEAVY_LEGS_ARMOR(2,4,1,2,0,"legs"),

    ;

    private int attackBonus;
    private int defenseBonus;
    private int damageBonus;
    private int armorBonus;
    private int range;
    private String slotType;

    GearAttributes(int attackBonus, int defenseBonus, int damageBonus, int armorBonus, int range, String slotType) {
        this.attackBonus = attackBonus;
        this.defenseBonus = defenseBonus;
        this.damageBonus = damageBonus;
        this.armorBonus = armorBonus;
        this.range = range;
        this.slotType = slotType;
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

    public int getArmorBonus() { return armorBonus; }

    public int getRange() {
        return range;
    }
}
