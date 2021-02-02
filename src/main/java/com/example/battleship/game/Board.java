package com.example.battleship.game;

import java.util.HashMap;
import java.util.Map;

public class Board {

    private Map<Field, Ship> board;

    public Board(Map<Field, Ship> board) {
        this.board = board;
    }

    public Map<Field, Ship> getBoard() {
        return board;
    }
}
