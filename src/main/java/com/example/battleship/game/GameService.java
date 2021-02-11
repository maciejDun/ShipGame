package com.example.battleship.game;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public final class GameService {

    public static Map<String, Game> mapOfGames = new HashMap<>();

    public Game createGame(String username, String gameName){
        Player player1 = new Player(username, BoardService.initPlayer1Board());
        Game gameInstance = new Game(player1, gameName);
        GameService.mapOfGames.put(gameName, gameInstance);
        log.info("You have created game: " + gameInstance.getGameName() + ", your name is: " + username);
        return gameInstance;
    }

    public Game joinGame(String username2, String gameName){
        Player player2 = new Player(username2, BoardService.initPlayer2Board());
        return mapOfGames.get(gameName).addPlayer2(player2);
    }

    public boolean shoot(String position, String gameName, String targetPlayer){
        return mapOfGames.get(gameName).shoot(position, targetPlayer);
    }

    public void gameOver(String gameName){
        mapOfGames.get(gameName).gameOver();
    }



}
