package com.example.battleship.game;

public class Game {
    private Player player1;
    private Player player2;
    private String gameName;


    public Game(Player player1, String gameName) {
        this.player1 = player1;
        this.gameName = gameName;
        this.player2 = null;

    }
    public Game addPlayer2(Player player2){
        this.player2 = player2;
        System.out.println("Player: " + player2.getUsername() + " has joined a game: " + this.gameName);
        return this;
    }

    public String getGameName() {
        return gameName;
    }

    public boolean shootToPlayer1(String position){
        Field field = new Field(position);
        if(this.player1.getBoard().containsKey(field)) return true;
        return false;
    }

}
