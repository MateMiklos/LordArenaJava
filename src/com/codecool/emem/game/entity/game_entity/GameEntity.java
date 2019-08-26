package com.codecool.emem.game.entity.game_entity;

import com.codecool.emem.game.MyRandom;
import com.codecool.emem.game.entity.Position;

public abstract class GameEntity {

    MyRandom myThrow;

    protected Position position;
    protected int movementPoints;

    // MAIN ATTRIBUTES
    protected int strength;
    protected int intellect;
    protected int dexterity;

    // COMBAT VALUES
    protected int attack;
    protected int defense;
    protected int damage;
    protected int armor;

    public void move() {
    }

    public boolean performAttack() {
        if (myThrow.throwWithD20() - attack < strength) return true;
        else return false;
    }

    public void calculateMovementPoints() {
        movementPoints = dexterity / 4;
        if (movementPoints == 0) movementPoints++;
    }

    private void addAttackBonusToAttack(int attack) {
        this.attack = attack;
    }
}
