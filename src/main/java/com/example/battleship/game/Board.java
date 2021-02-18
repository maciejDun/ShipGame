package com.example.battleship.game;

import lombok.AccessLevel;
import lombok.Getter;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Getter
public class Board {

    private final Map<Field, Ship> board;
    private boolean isThereAliveShips;

    public Board(Map<Field, Ship> board) {
        this.board = Collections.unmodifiableMap(board);
        this.isThereAliveShips = true;
    }

    public boolean areAllShipsSunken(){
        for (Ship ship : board.values()){
            if (!ship.isSunken()) return false;
        }
        this.isThereAliveShips = false;
        return true;
    }

}

