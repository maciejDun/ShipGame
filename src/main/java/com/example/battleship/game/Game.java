package com.example.battleship.game;

public class Game {
    private Player player1;
    private Player player2;
    private String gameName;
    private boolean gameOver;


    public Game(Player player1, String gameName) {
        this.player1 = player1;
        this.gameName = gameName;
        this.player2 = null;
        this.gameOver = false;

    }
    public Game addPlayer2(Player player2){
        this.player2 = player2;
        System.out.println("Player: " + player2.getUsername() + " has joined a game: " + this.gameName);
        return this;
    }

    public String getGameName() {
        return gameName;
    }

    public boolean shoot(String position, String playerName){
        Field field = new Field(position.toUpperCase());
        if (validateName(playerName)) return false;
        System.out.println("You are shooting to " + playerName + " ......");
        if (playerName.equals(player1.getUsername())) {
            Player targetPlayer = player1;
            if (targetPlayer.getBoard().containsKey(field)){
                if(hitShip(field, targetPlayer)) {
                    this.player2.addPlayerScore();
                    checkAllSunkenShips(targetPlayer);
                    return true;
                } else this.player2.decrementPlayerScore();
            } else {
                System.out.println("You missed...... try again!");
                this.player2.decrementPlayerScore();
            }
        } else {
            Player targetPlayer = player2;
            if (targetPlayer.getBoard().containsKey(field)) {
                if(hitShip(field, targetPlayer)) {
                    this.player1.addPlayerScore();
                    checkAllSunkenShips(targetPlayer);
                    return true;
                } else this.player1.decrementPlayerScore();
            } else {
                System.out.println("You missed...... try again!");
                this.player1.decrementPlayerScore();
            }
        }
        return false;
    }
    public boolean hitShip(Field field, Player player){
        Ship ship = player.getBoard().get(field);
        if (!ship.isHit(field)) {
            ship.hit(field);
            System.out.println("You hit " + player.getUsername() + "'s" +
                    " ship! Ship is: " + ship.getShipType());
            if (ship.isSunken()){
                System.out.println("The " + ship.getShipType() + " is going down!!!" );
            }
            return true;
        } else {
            System.out.println("You hit the same ship part! Try again.");
            return false;
        }
    }

    private boolean validateName(String name){
        if (!player1.getUsername().equalsIgnoreCase(name) && !player2.getUsername().equalsIgnoreCase(name)){
            System.out.println("There is no such name, try again");
            return true;
        }
        return false;
    }
    public void checkAllSunkenShips(Player player){
        if (player.checkAllSunkenShips()){
            System.out.println("Player: " + player.getUsername() + " have no ships left on his board!!!!");
            player.setIsLost();
            gameOver();
        }
    }
    public void gameOver(){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("Game is over");
        System.out.println("Player: " + this.player1.getUsername() + " score: " + player1.getPlayerScore());
        System.out.println("Player: " + this.player2.getUsername() + " score: " + player2.getPlayerScore());
        if (player1.getIsLost()) {
            System.out.println("Player: " + this.player2.getUsername() + " have won!!!");
        } else if (player2.getIsLost()) {
            System.out.println("Player: " + this.player1.getUsername() + " have won!!!");
        } else if (player1.getPlayerScore() > player2.getPlayerScore()) {
            System.out.println("Player: " + this.player1.getUsername() + " have won!!!");
        } else if (player2.getPlayerScore() > player1.getPlayerScore()){
            System.out.println("Player: " + this.player2.getUsername() + " have won!!!");
        } else {
            System.out.println("There is a draw, no one have won!!!");
        }
        this.gameOver = true;
    }






}
