package com.example.battleship.game;

import java.util.List;
import java.util.Map;

public class TwoDeckerShip extends Ship {

    public TwoDeckerShip(Map<Field, ShipPart> shipParts) {
        super(ShipType.TWO_DECKER, shipParts);
    }

    @Override
    Field getShipField(int i) {
        if (i < 0 || i > 1) return null;
        return getShipParts().get(i).getPosition();
    }

}
