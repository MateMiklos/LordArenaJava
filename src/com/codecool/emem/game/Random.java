package com.codecool.emem.game;

import java.util.Random;

class MyRandom {
    private Random random = new Random();

    public int generateRandomNumberBetween(int min, int max) {
        return random.nextInt((max - min + 1) - min);
    }
}
