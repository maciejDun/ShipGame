package com.example.battleship.game;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public final class Game {
    private final Player player1;
    private Player player2;
    @Getter
    private final String gameName;
    private boolean gameOver;

    public Game(Player player1, String gameName) {
        this.player1 = player1;
        this.gameName = gameName;
        this.player2 = null;
        this.gameOver = false;

    }
    public Game addPlayer2(Player player2){
        this.player2 = player2;
        log.info("Player: " + player2.getUsername() + " has joined a game: " + this.gameName);
        return this;
    }

    public boolean shoot(String position, String playerName){
        Field field = Field.createField(position.toUpperCase());
        if (validateName(playerName)) return false;
        log.info("You are shooting to " + playerName + " ......");
        Player targetPlayer = chooseTargetPlayer(playerName);
        Player shootingPlayer = chooseShootingPlayer(playerName);
            if (targetPlayer.getBoard().containsKey(field)){
                if(hitShip(field, targetPlayer)) {
                    shootingPlayer.addPlayerScore();
                    checkAllSunkenShips(targetPlayer);
                    return true;
                } else shootingPlayer.decrementPlayerScore();
            } else {
                log.info("You missed...... try again!");
                shootingPlayer.decrementPlayerScore();
            }
        return false;
    }

    public void gameOver(){
        log.info("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        log.info("Game is over");
        log.info("Player: " + this.player1.getUsername() + " score: " + player1.getPlayerScore());
        log.info("Player: " + this.player2.getUsername() + " score: " + player2.getPlayerScore());
        if (player1.getIsLost()) {
            log.info("Player: " + this.player2.getUsername() + " have won!!!");
        } else if (player2.getIsLost()) {
            log.info("Player: " + this.player1.getUsername() + " have won!!!");
        } else if (player1.getPlayerScore() > player2.getPlayerScore()) {
            log.info("Player: " + this.player1.getUsername() + " have won!!!");
        } else if (player2.getPlayerScore() > player1.getPlayerScore()){
            log.info("Player: " + this.player2.getUsername() + " have won!!!");
        } else {
            log.info("There is a draw, no one have won!!!");
        }
        this.gameOver = true;
    }

    private Player chooseTargetPlayer(String playerName){
        Player targetPlayer;
        if (playerName.equalsIgnoreCase(player1.getUsername())){
            targetPlayer = player1;
        } else {
            targetPlayer = player2;
        }
        return targetPlayer;
    }
    private Player chooseShootingPlayer(String playerName){
        Player shootingPlayer;
        if (playerName.equals(player1.getUsername())){
            shootingPlayer = player2;
        } else {
            shootingPlayer = player1;
        }
        return shootingPlayer;
    }

    private void checkAllSunkenShips(Player player){
        if (player.checkAllSunkenShips()){
            log.info("Player: " + player.getUsername() + " have no ships left on his board!!!!");
            player.setIsLost();
            gameOver();
        }
    }

    private boolean hitShip(Field field, Player player){
        Ship ship = player.getBoard().get(field);
        if (!ship.isHit(field)) {
            ship.hit(field);
            log.info("You hit " + player.getUsername() + "'s" +
                    " ship! Ship is: " + ship.getShipType());
            if (ship.isSunken()){
                log.info("The " + ship.getShipType() + " is going down!!!" );
            }
            return true;
        } else {
            log.info("You hit the same ship part! Try again.");
            return false;
        }
    }

    private boolean validateName(String name){
        if (!player1.getUsername().equalsIgnoreCase(name) && !player2.getUsername().equalsIgnoreCase(name)){
            log.info("There is no such name, try again");
            return true;
        }
        return false;
    }

}
