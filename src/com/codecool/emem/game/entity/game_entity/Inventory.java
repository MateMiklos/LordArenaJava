package com.codecool.emem.game.entity.game_entity;

import com.codecool.emem.game.gear.Armor;
import com.codecool.emem.game.gear.Weapon;

import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private Weapon mainHandWeapon;
    private Weapon offHandWeapon;
    private Armor headArmor;
    private Armor torsoArmor;
    private Armor armsArmor;
    private Armor legsArmor;

    public Weapon getMainHandWeapon() {
        return mainHandWeapon;
    }

    public Weapon getOffHandWeapon() {
        return offHandWeapon;
    }

    public List<Armor> getArmorSet() {
        List<Armor> armorSet = new LinkedList<>();
        armorSet.add(headArmor);
        armorSet.add(torsoArmor);
        armorSet.add(armsArmor);
        armorSet.add(legsArmor);
        return armorSet;
    }
}
