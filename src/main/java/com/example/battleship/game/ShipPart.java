package com.example.battleship.game;

import lombok.Getter;

public final class ShipPart {
    @Getter
    private boolean isHit;
    private final Field position;

    public ShipPart(Field position) {
        this.isHit = false;
        this.position = position;
    }

    public void hit(){
        this.isHit = true;
    }

}



