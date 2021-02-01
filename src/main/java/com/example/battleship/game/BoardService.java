package com.example.battleship.game;

import java.util.List;
import java.util.Map;

public class BoardService {


    public Board initPlayer1Board() {
        Field oneDeckerPosition1 = new Field("A1");

        Field twoDeckerPosition1 = new Field("D1");
        Field twoDeckerPosition2 = new Field("D2");

        Field threeDeckerPosition1 = new Field("G1");
        Field threeDeckerPosition2 = new Field("G2");
        Field threeDeckerPosition3 = new Field("G3");

        Field fourDeckerPosition1 = new Field("J1");
        Field fourDeckerPosition2 = new Field("J2");
        Field fourDeckerPosition3 = new Field("J3");
        Field fourDeckerPosition4 = new Field("J4");

        ShipPart oneDeckerShipPart1 = new ShipPart(oneDeckerPosition1);

        ShipPart twoDeckerShipPart1 = new ShipPart(twoDeckerPosition1);
        ShipPart twoDeckerShipPart2 = new ShipPart(twoDeckerPosition2);

        ShipPart threeDeckerShipPart1 = new ShipPart(threeDeckerPosition1);
        ShipPart threeDeckerShipPart2 = new ShipPart(threeDeckerPosition2);
        ShipPart threeDeckerShipPart3 = new ShipPart(threeDeckerPosition3);

        ShipPart fourDeckerShipPart1 = new ShipPart(fourDeckerPosition1);
        ShipPart fourDeckerShipPart2 = new ShipPart(fourDeckerPosition2);
        ShipPart fourDeckerShipPart3 = new ShipPart(fourDeckerPosition3);
        ShipPart fourDeckerShipPart4 = new ShipPart(fourDeckerPosition4);

        Ship oneDecker = new Ship(ShipType.ONE_DECKER, List.of(oneDeckerShipPart1));

        Ship twoDecker = new Ship(ShipType.TWO_DECKER, List.of(twoDeckerShipPart1, twoDeckerShipPart2));

        Ship threeDecker = new Ship(ShipType.THREE_DECKER, List.of(threeDeckerShipPart1, threeDeckerShipPart2, threeDeckerShipPart3));

        Ship fourDecker = new Ship(ShipType.FOUR_DECKER, List.of(fourDeckerShipPart1, fourDeckerShipPart2, fourDeckerShipPart3, fourDeckerShipPart4));

        Map<Field, Ship> board = Map.of(
                oneDeckerPosition1, oneDecker,
                twoDeckerPosition1, twoDecker,
                twoDeckerPosition2, twoDecker,
                threeDeckerPosition1, threeDecker,
                threeDeckerPosition2, threeDecker,
                threeDeckerPosition3, threeDecker,
                fourDeckerPosition1, fourDecker,
                fourDeckerPosition2, fourDecker,
                fourDeckerPosition3, fourDecker,
                fourDeckerPosition4, fourDecker
        );

        return new Board(board);
    }

    public Board createPlayer2Ships() {
        Field oneDeckerPosition1 = new Field("J10");

        Field twoDeckerPosition1 = new Field("G9");
        Field twoDeckerPosition2 = new Field("G10");

        Field threeDeckerPosition1 = new Field("D8");
        Field threeDeckerPosition2 = new Field("D9");
        Field threeDeckerPosition3 = new Field("D10");

        Field fourDeckerPosition1 = new Field("A1");
        Field fourDeckerPosition2 = new Field("B2");
        Field fourDeckerPosition3 = new Field("C3");
        Field fourDeckerPosition4 = new Field("D4");

        ShipPart oneDeckerShipPart1 = new ShipPart(oneDeckerPosition1);

        ShipPart twoDeckerShipPart1 = new ShipPart(twoDeckerPosition1);
        ShipPart twoDeckerShipPart2 = new ShipPart(twoDeckerPosition2);

        ShipPart threeDeckerShipPart1 = new ShipPart(threeDeckerPosition1);
        ShipPart threeDeckerShipPart2 = new ShipPart(threeDeckerPosition2);
        ShipPart threeDeckerShipPart3 = new ShipPart(threeDeckerPosition3);

        ShipPart fourDeckerShipPart1 = new ShipPart(fourDeckerPosition1);
        ShipPart fourDeckerShipPart2 = new ShipPart(fourDeckerPosition2);
        ShipPart fourDeckerShipPart3 = new ShipPart(fourDeckerPosition3);
        ShipPart fourDeckerShipPart4 = new ShipPart(fourDeckerPosition4);

        Ship oneDecker = new Ship(ShipType.ONE_DECKER, List.of(oneDeckerShipPart1));

        Ship twoDecker = new Ship(ShipType.TWO_DECKER, List.of(twoDeckerShipPart1, twoDeckerShipPart2));

        Ship threeDecker = new Ship(ShipType.THREE_DECKER, List.of(threeDeckerShipPart1, threeDeckerShipPart2, threeDeckerShipPart3));

        Ship fourDecker = new Ship(ShipType.FOUR_DECKER, List.of(fourDeckerShipPart1, fourDeckerShipPart2, fourDeckerShipPart3, fourDeckerShipPart4));

        Map<Field, Ship> board = Map.of(
                oneDeckerPosition1, oneDecker,
                twoDeckerPosition1, twoDecker,
                twoDeckerPosition2, twoDecker,
                threeDeckerPosition1, threeDecker,
                threeDeckerPosition2, threeDecker,
                threeDeckerPosition3, threeDecker,
                fourDeckerPosition1, fourDecker,
                fourDeckerPosition2, fourDecker,
                fourDeckerPosition3, fourDecker,
                fourDeckerPosition4, fourDecker
        );

        return new Board(board);
    }
}
