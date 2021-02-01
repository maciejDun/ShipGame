package com.example.battleship.game;

public class Game {
    private Player player1;
    private Player player2;

    private int player1Score;
    private int player2Score;

    public Game(Player player1) {
        this.player1 = player1;
        this.player2 = null;
        this.player1Score = 0;
        this.player2Score = 0;
    }
}
