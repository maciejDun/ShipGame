package com.example.battleship.game;

import java.util.Map;

public class Player {
    private String username;
    private int playerScore;
    private Board board;
    private boolean isLost;

    public Player(String username, Board board) {
        this.username = username;
        this.board = board;
        this.playerScore = 10;
        this.isLost = false;
    }

    public String getUsername() {
        return username;
    }
    public void addPlayerScore(){
        System.out.println("Adding 10 points to " + this.username + " account");
        playerScore += 10;
        System.out.println(this.username + " have " + this.playerScore + " points");
    }
    public void decrementPlayerScore(){
        if (this.playerScore > 0) {
            System.out.println("***Decrementing player: " + this.username + " score by 1 point");
            playerScore--;
        }
        System.out.println(this.username + " have " + this.playerScore + " points");
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public Map<Field, Ship> getBoard() {
        return board.getBoard();
    }

    public boolean checkAllSunkenShips(){
        return this.board.checkAllSunkenShips();
    }
    public void setIsLost(){
        this.isLost = true;
    }

    public boolean getIsLost() {
        return isLost;
    }
}
