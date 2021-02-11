package com.example.battleship.game;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Slf4j
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
        log.info("Adding 10 points to " + this.username + " account");
        playerScore += 10;
        log.info(this.username + " have " + this.playerScore + " points");
    }
    public void decrementPlayerScore(){
        if (this.playerScore > 0) {
            log.info("***Decrementing player: " + this.username + " score by 1 point");
            playerScore--;
        }
        log.info(this.username + " have " + this.playerScore + " points");
    }

    public Map<Field, Ship> getBoard() {
        board.isThereAliveShips();
        return board.getBoard();
    }

    public boolean checkAllSunkenShips(){
        return this.board.areAllShipsSunken();
    }

    public void setIsLost(){
        this.isLost = true;
    }

    public boolean getIsLost() {
        return isLost;
    }
}

