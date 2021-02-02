package com.example.battleship.game;

import java.util.List;

public class FourDeckerShip extends Ship{
    public FourDeckerShip(List<ShipPart> shipParts) {
        super(ShipType.FOUR_DECKER, shipParts);
    }

    @Override
    Field getShipField(int i) {
        return getShipParts().get(i).getPosition();
    }
}
