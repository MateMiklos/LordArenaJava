package com.codecool.emem.game;

import java.util.Random;

public class MyRandom {
    
    private Random random = new Random();
    
    private int generateRandomNumberBetween(int min, int max) {
        return random.nextInt(max - min + 1);
    }
    
    public int throwWithD20() {
        return generateRandomNumberBetween(1,20);
    }
    
    public int throwWithD12() {
        return generateRandomNumberBetween(1,12);
    }

    public int throwWithD10() {
        return generateRandomNumberBetween(1,10);
    }

    public int throwWithD8() {
        return generateRandomNumberBetween(1,8);
    }
    
    public int throwWithD6() {
        return generateRandomNumberBetween(1,6);
    }

    public int throwWithTwoD6() {
        return generateRandomNumberBetween(2,12);
    }

    public int throwWithThreeD6() {
        return generateRandomNumberBetween(3,18);
    }
}
