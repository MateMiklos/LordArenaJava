package com.codecool.emem.game.entity.game_entity;

import com.codecool.emem.game.gear.MeleeWeapon;
import com.codecool.emem.game.gear.Weapon;

import java.util.ArrayList;
import java.util.List;

public class Warrior extends Character {

    private List<Weapon> extraWeaponSet = new ArrayList<>();

    public void setWeaponSet() {
        weaponSet.add(new MeleeWeapon(7, 2, 2, 0, "Two-Handed Sword", 2));
        extraWeaponSet.add(new MeleeWeapon(6, 1, 1,0,"One-Handed Sword", 1));
        extraWeaponSet.add(new MeleeWeapon(0,5,0,2,"Shield", 1));
    }
}
