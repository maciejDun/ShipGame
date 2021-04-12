package com.battleship.model;

import java.util.Map;

public class OneDeckerShip extends Ship {

    public OneDeckerShip(Map<Field, ShipPart> shipParts) {
        super(ShipType.ONE_DECKER, shipParts);
    }

}

