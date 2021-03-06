package com.example.battleship.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OneDeckerShip extends Ship {

    public OneDeckerShip(Map<Field, ShipPart> shipParts) {
        super(ShipType.ONE_DECKER, shipParts);
    }

    @Override
    Field getShipField(int i) {
        if (i != 0) return null;
        return super.getShipParts().get(i).getPosition();
    }
}
