package com.battleship.model;

import lombok.Getter;

import java.util.Collections;
import java.util.Map;

public abstract class Ship {
    @Getter
    private final ShipType shipType;
    @Getter
    private boolean isSunken;
    private final Map<Field, ShipPart> shipParts;

    public Ship(ShipType shipType, Map<Field, ShipPart> shipParts) {
        this.shipType = shipType;
        this.isSunken = false;
        this.shipParts = Collections.unmodifiableMap(shipParts);
    }

    public boolean isHit(Field field){
        return  this.shipParts.get(field).isHit();
    }

    public void hit(Field field){
        this.shipParts.get(field).hit();
        checkIfSunken();
    }

    private boolean checkIfSunken(){
        for (ShipPart shipPart : shipParts.values()){
            if (!shipPart.isHit()) return false;
        }
        this.isSunken = true;
        return true;
    }
}

