package com.codecool.emem.game.entity;

public enum Position {
    POSITION(0,0);

    private int xCoordinate;
    private int yCoordinate;

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
}
