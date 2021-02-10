package com.example.battleship.game;

public final class ShipPart {
    private boolean isHit;
    private final Field position;

    public ShipPart(Field position) {
        this.isHit = false;
        this.position = position;
    }

    public boolean isHit() {
        return isHit;
    }

    public void hit(){
        this.isHit = true;
    }

}



