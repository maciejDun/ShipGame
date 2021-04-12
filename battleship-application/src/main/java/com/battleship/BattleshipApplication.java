package com.battleship;

import com.battleship.service.GameService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BattleshipApplication {

    public static void main(String[] args) {
        SpringApplication.run(BattleshipApplication.class, args);
        

        GameService gameService = new GameService();
        gameService.createGame("Mac", "ShipGame");
        gameService.joinGame("Tim", "ShipGame");
        gameService.shoot("A1", "ShipGame", "Tim");
        gameService.shoot("B1", "ShipGame", "Tim");
        gameService.shoot("C1", "ShipGame", "Tim");
        gameService.shoot("D1", "ShipGame", "Tim");
        gameService.shoot("J10", "ShipGame", "Tim");
        gameService.shoot("J110", "ShipGame", "Tim");
        gameService.shoot("A1", "ShipGame", "Mac");
        gameService.shoot("G9", "ShipGame", "Tim");
        gameService.shoot("G10", "ShipGame", "Tim");
        gameService.shoot("D8", "ShipGame", "Tim");
        gameService.shoot("D8", "ShipGame", "Tim");
        gameService.shoot("D7", "ShipGame", "Tim");
        gameService.shoot("D9", "ShipGame", "Tim");
        gameService.shoot("D10", "ShipGame", "Tim");





    }

}