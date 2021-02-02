package com.example.battleship.game;

public class Player {
    private String username;
    private int playerScore;

    private Board board;

    public Player(String username, Board board) {
        this.username = username;
        this.board = board;
        this.playerScore = 0;
    }
}
