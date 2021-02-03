package com.example.battleship.game;

import java.util.List;

public abstract class Ship {
    private ShipType shipType;
    private boolean isSunken;
    private List<ShipPart> shipParts;

    public Ship(ShipType shipType, List<ShipPart> shipParts) {
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

    public List<ShipPart> getShipParts() {
        return shipParts;
    }
    abstract Field getShipField(int i);

    public boolean isHit(ShipPart shipPart){
        return shipPart.isHit();
    }
//    public ShipPart getShipPart(Field field){
//        return this.shipParts.get(shipParts.indexOf(field));
//    }
//    public boolean isHit(Field field){
//        return this.shipParts.get(this.shipParts.indexOf(shipParts.)).isHit();
//    }
}
