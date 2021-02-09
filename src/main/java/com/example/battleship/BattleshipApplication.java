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
//        gameService.shoot("A1", "ShipGame", "Tim");
//        gameService.shoot("B1", "ShipGame", "Tim");
//        gameService.shoot("C1", "ShipGame", "Tim");
//        gameService.shoot("D1", "ShipGame", "Tim");
//        gameService.shoot("J10", "ShipGame", "Tim");
//        gameService.shoot("J110", "ShipGame", "Tim");
//        gameService.shoot("A1", "ShipGame", "Mac");
//        gameService.shoot("G9", "ShipGame", "Tim");
//        gameService.shoot("G10", "ShipGame", "Tim");
//        gameService.shoot("D8", "ShipGame", "Tim");
//        gameService.shoot("D8", "ShipGame", "Tim");
//        gameService.shoot("D7", "ShipGame", "Tim");
//        gameService.shoot("D9", "ShipGame", "Tim");
        gameService.shoot("D10", "ShipGame", "Tim");
        gameService.shoot("D10", "ShipGame", "Tim");
        gameService.shoot("D10", "ShipGame", "Tim");
        gameService.shoot("D10", "ShipGame", "Mac");
        gameService.shoot("A1", "ShipGame", "Mac");
        gameService.shoot("A1", "ShipGame", "Mac");
        gameService.shoot("D1", "ShipGame", "Mac");
        gameService.gameOver("ShipGame");





    }

}
