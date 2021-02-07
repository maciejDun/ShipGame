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
        this.playerScore = 0;
        this.isLost = true;
    }

    public String getUsername() {
        return username;
    }
    public void addPlayerScore(){
        System.out.println("Adding 10 points to " + this.username + " account");
        playerScore += 10;
    }
    public void decrementPlayerScore(){
        if (this.playerScore > 0) {
            System.out.println("Decrementing player: " + this.username + " score by 1 point");
            playerScore--;
        }
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
