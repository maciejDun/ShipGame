package com.battleship.model;

import java.util.Map;

public class TwoDeckerShip extends Ship {

    public TwoDeckerShip(Map<Field, ShipPart> shipParts) {
        super(ShipType.TWO_DECKER, shipParts);
    }

}

