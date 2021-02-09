package com.example.battleship.game;

import java.util.HashMap;
import java.util.Map;

public class Board {

    private Map<Field, Ship> board;
    private boolean isThereAliveShips;

    public Board(Map<Field, Ship> board) {
        this.board = board;
        this.isThereAliveShips = true;
    }

    public Map<Field, Ship> getBoard() {
        return board;
    }

    public boolean checkAllSunkenShips(){
        for (Ship ship : board.values()){
            if (!ship.isSunken()) return false;
        }
        this.isThereAliveShips = false;
        return true;
    }
}

