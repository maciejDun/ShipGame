package com.example.battleship.game;

import java.util.List;

public class ThreeDeckerShip extends Ship{
    public ThreeDeckerShip(List<ShipPart> shipParts) {
        super(ShipType.THREE_DECKER, shipParts);
    }

    @Override
    Field getShipField(int i) {
        if (i < 0 || i > 2) return null;
        return getShipParts().get(i).getPosition();
    }
}
