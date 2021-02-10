package com.example.battleship.game;

import lombok.Getter;

import java.util.Map;


public final class Player {
    @Getter
    private final String username;
    @Getter
    private int playerScore;
    private final Board board;
    private boolean isLost;

    public Player(String username, Board board) {
        this.username = username;
        this.board = board;
        this.playerScore = 10;
        this.isLost = false;
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

    public Map<Field, Ship> getBoard() {
        board.isThereAliveShips();
        return board.getBoard();

    }

    public boolean checkAllSunkenShips(){
        return this.board.areAllShipsSunken();
    }
    public void isLost(){
        this.isLost = true;
    }

    public boolean getIsLost() {
        return isLost;
    }
}

