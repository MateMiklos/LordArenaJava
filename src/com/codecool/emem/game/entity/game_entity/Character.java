package com.codecool.emem.game.entity.game_entity;

import com.codecool.emem.game.gear.Armor;
import com.codecool.emem.game.gear.Weapon;

import java.util.ArrayList;
import java.util.List;

public class Character extends GameEntity {
    protected List<Weapon> weaponSet = new ArrayList<>();
    protected List<Armor> armorSet = new ArrayList<>();
}
