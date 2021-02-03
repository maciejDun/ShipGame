package com.example.battleship.game;

import java.util.List;

public class TwoDeckerShip extends Ship {

    public TwoDeckerShip(List<ShipPart> shipParts) {
        super(ShipType.TWO_DECKER, shipParts);
    }

    @Override
    Field getShipField(int i) {
        if (i < 0 || i > 1) return null;
        return getShipParts().get(i).getPosition();
    }

}
