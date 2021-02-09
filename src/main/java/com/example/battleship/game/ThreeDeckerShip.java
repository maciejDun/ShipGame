package com.example.battleship.game;

import java.util.List;
import java.util.Map;

public class ThreeDeckerShip extends Ship{
    public ThreeDeckerShip(Map<Field, ShipPart> shipParts) {
        super(ShipType.THREE_DECKER, shipParts);
    }

}

