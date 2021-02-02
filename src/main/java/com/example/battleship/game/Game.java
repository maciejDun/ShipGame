package com.example.battleship.game;

public class Game {
    private Player player1;
    private Player player2;


    public Game(Player player1) {
        this.player1 = player1;
        this.player2 = null;

    }
    public void joinGame(Player player2){
        this.player2 = player2;
    }
}
