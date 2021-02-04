package com.example.battleship.game;

import java.util.HashMap;
import java.util.Map;

public class GameService {

    public static Map<String, Game> mapOfGames = new HashMap<>();


    public Game createGame(String username, String gameName){
        Player player1 = new Player(username, BoardService.initPlayer1Board());
        Game gameInstance = new Game(player1, gameName);
        GameService.mapOfGames.put(gameName, gameInstance);
        System.out.println("You have created game: " + gameInstance.getGameName() + ", your name is: " + username);
        return gameInstance;
    }
    public Game joinGame(String username2, String gameName){
        Player player2 = new Player(username2, BoardService.initPlayer2Board());
        return mapOfGames.get(gameName).addPlayer2(player2);

    }
    public boolean shoot(String position, String gameName){
        return mapOfGames.get(gameName).shootToPlayer1(position);
    }



}
