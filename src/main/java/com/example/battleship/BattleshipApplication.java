package com.example.battleship;

import com.example.battleship.game.Board;
import com.example.battleship.game.BoardService;
import com.example.battleship.game.GameService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BattleshipApplication {

    public static void main(String[] args) {
//        SpringApplication.run(BattleshipApplication.class, args);

//        BoardService boardService = new BoardService();
//        Board board = boardService.initPlayer1Board();
//        boardService.initPlayer2Board();
//        System.out.println();

        GameService gameService = new GameService();
        gameService.createGame("Mac", "ShipGame");
        gameService.joinGame("Tim", "ShipGame");





    }

}
