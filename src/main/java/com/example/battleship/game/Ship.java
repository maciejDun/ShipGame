package com.example.battleship.game;

import java.util.List;
import java.util.Map;

public abstract class Ship {
    private ShipType shipType;
    private boolean isSunken;
    private Map<Field, ShipPart> shipParts;

    public Ship(ShipType shipType, Map<Field, ShipPart> shipParts) {
        this.shipType = shipType;
        this.isSunken = false;
        this.shipParts = shipParts;
    }

    public ShipType getShipType() {
        return shipType;
    }

    public boolean isSunken() {
        return isSunken;
    }

    public Map<Field, ShipPart> getShipParts() {
        return shipParts;
    }
    abstract Field getShipField(int i);

    public boolean isHit(ShipPart shipPart){
        return shipPart.isHit();
    }
    public void hit(Field field){
        this.shipParts.get(field).hit();
    }
}
