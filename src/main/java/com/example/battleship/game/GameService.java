package com.example.battleship.game;

public class GameService {



    public Game createGame(String username){
        Player player1 = new Player(username, BoardService.initPlayer1Board());
        Game game = new Game(player1);
        return game;
    }
    public Game joinGame(String username2){
        Player player2 = new Player(username2, BoardService.initPlayer2Board());
        createGame().joinGame(player2);
    }



}
