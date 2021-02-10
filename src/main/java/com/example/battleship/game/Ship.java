package com.example.battleship.game;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public abstract class Ship {
    private final ShipType shipType;
    private boolean isSunken;
    private final Map<Field, ShipPart> shipParts;

    public Ship(ShipType shipType, Map<Field, ShipPart> shipParts) {
        this.shipType = shipType;
        this.isSunken = false;
        this.shipParts = Collections.unmodifiableMap(shipParts);
    }

    public ShipType getShipType() {
        return shipType;
    }

    public boolean isSunken() {
        return isSunken;
    }
    public boolean checkIfSunken(){
        for (ShipPart shipPart : shipParts.values()){
            if (!shipPart.isHit()) return false;
        }
        this.isSunken = true;
        return true;
    }

    public boolean isHit(Field field){
        return  this.shipParts.get(field).isHit();
    }
    public void hit(Field field){
        this.shipParts.get(field).hit();
        checkIfSunken();
    }
}

