package com.example.battleship.game;

import java.util.List;
import java.util.Map;

public class FourDeckerShip extends Ship{

    public FourDeckerShip(Map<Field, ShipPart> shipParts) {
        super(ShipType.FOUR_DECKER, shipParts);
    }

}

