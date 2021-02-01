package com.example.battleship.game;

import java.util.List;

public class Ship {
    private ShipType shipType;
    private boolean isSunken;
    private List<ShipPart> shipParts;

    public Ship(ShipType shipType, List<ShipPart> shipParts) {
        this.shipType = shipType;
        this.isSunken = false;
        this.shipParts = shipParts;
    }
}
