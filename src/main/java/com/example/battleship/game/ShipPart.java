package com.example.battleship.game;

public class ShipPart {
    private boolean isHit;
    private Field position;

    public ShipPart(Field position) {
        this.isHit = false;
        this.position = position;
    }

    public boolean isHit() {
        return isHit;
    }

    public Field getPosition() {
        return position;
    }
}


