package com.codecool.emem.game.entity;

public enum Position {
    POSITION();

    Position(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public int getCoordinateX() {
        return xCoordinate;
    }

    public int getCoordinateY() {
        return yCoordinate;
    }

    private int xCoordinate;
    private int yCoordinate;
}
