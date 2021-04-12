package com.battleship.model;

import java.util.Map;

public class ThreeDeckerShip extends Ship{

    public ThreeDeckerShip(Map<Field, ShipPart> shipParts) {
        super(ShipType.THREE_DECKER, shipParts);
    }

}

