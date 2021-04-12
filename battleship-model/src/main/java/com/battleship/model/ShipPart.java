package com.battleship.model;

import lombok.Getter;

public class ShipPart {
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



