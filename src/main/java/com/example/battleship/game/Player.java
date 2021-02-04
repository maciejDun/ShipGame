package com.example.battleship.game;

import java.util.Map;

public class Player {
    private String username;
    private int playerScore;
    private Board board;

    public Player(String username, Board board) {
        this.username = username;
        this.board = board;
        this.playerScore = 0;
    }

    public String getUsername() {
        return username;
    }
    public void addPlayerScore(){
        playerScore++;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public Map<Field, Ship> getBoard() {
        return board.getBoard();
    }
}
