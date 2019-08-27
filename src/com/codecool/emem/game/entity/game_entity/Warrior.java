package com.codecool.emem.game.entity.game_entity;

import com.codecool.emem.game.gear.GearAttributes;
import com.codecool.emem.game.gear.MeleeWeapon;
import com.codecool.emem.game.gear.Weapon;

import java.util.ArrayList;
import java.util.List;

public class Warrior extends Character {

    private List<Weapon> extraWeaponSet = new ArrayList<>();

    public void setWeaponSet() {
        weaponSet.add(new MeleeWeapon(GearAttributes.TWO_HANDED_SWORD));
        extraWeaponSet.add(new MeleeWeapon(GearAttributes.ONE_HANDED_AXE));
        extraWeaponSet.add(new MeleeWeapon(GearAttributes.SHIELD));
    }
}
