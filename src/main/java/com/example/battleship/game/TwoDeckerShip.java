package com.example.battleship.game;

import java.util.List;
import java.util.Map;

public final class TwoDeckerShip extends Ship {

    public TwoDeckerShip(Map<Field, ShipPart> shipParts) {
        super(ShipType.TWO_DECKER, shipParts);
    }

}

