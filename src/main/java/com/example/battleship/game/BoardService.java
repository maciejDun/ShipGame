package com.example.battleship.game;

import lombok.extern.slf4j.Slf4j;


import java.util.Map;

@Slf4j
public final class BoardService {


    public static Board initPlayer1Board() {
        Field oneDeckerField1 = Field.createField("A1");

        Field twoDeckerField1 = Field.createField("D1");
        Field twoDeckerField2 = Field.createField("D2");

        Field threeDeckerField1 = Field.createField("G1");
        Field threeDeckerField2 = Field.createField("G2");
        Field threeDeckerField3 = Field.createField("G3");

        Field fourDeckerField1 = Field.createField("J1");
        Field fourDeckerField2 = Field.createField("J2");
        Field fourDeckerField3 = Field.createField("J3");
        Field fourDeckerField4 = Field.createField("J4");

        ShipPart oneDeckerShipPart1 = new ShipPart(oneDeckerField1);

        ShipPart twoDeckerShipPart1 = new ShipPart(twoDeckerField1);
        ShipPart twoDeckerShipPart2 = new ShipPart(twoDeckerField2);

        ShipPart threeDeckerShipPart1 = new ShipPart(threeDeckerField1);
        ShipPart threeDeckerShipPart2 = new ShipPart(threeDeckerField2);
        ShipPart threeDeckerShipPart3 = new ShipPart(threeDeckerField3);

        ShipPart fourDeckerShipPart1 = new ShipPart(fourDeckerField1);
        ShipPart fourDeckerShipPart2 = new ShipPart(fourDeckerField2);
        ShipPart fourDeckerShipPart3 = new ShipPart(fourDeckerField3);
        ShipPart fourDeckerShipPart4 = new ShipPart(fourDeckerField4);


        OneDeckerShip oneDeckerShip = new OneDeckerShip(Map.of(oneDeckerField1, oneDeckerShipPart1));


        TwoDeckerShip twoDeckerShip = new TwoDeckerShip(Map.of(twoDeckerField1, twoDeckerShipPart1,
                twoDeckerField2, twoDeckerShipPart2));

        ThreeDeckerShip threeDeckerShip = new ThreeDeckerShip(Map.of(threeDeckerField1, threeDeckerShipPart1,
                threeDeckerField2, threeDeckerShipPart2,
                threeDeckerField3, threeDeckerShipPart3));

        FourDeckerShip fourDeckerShip = new FourDeckerShip(Map.of(fourDeckerField1, fourDeckerShipPart1,
                fourDeckerField2, fourDeckerShipPart2,
                fourDeckerField3, fourDeckerShipPart3,
                fourDeckerField4, fourDeckerShipPart4));

        Board board = new Board(Map.of(oneDeckerField1, oneDeckerShip,
                twoDeckerField1, twoDeckerShip,
                twoDeckerField2, twoDeckerShip,
                threeDeckerField1, threeDeckerShip,
                threeDeckerField2, threeDeckerShip,
                threeDeckerField3, threeDeckerShip,
                fourDeckerField1, fourDeckerShip,
                fourDeckerField2, fourDeckerShip,
                fourDeckerField3, fourDeckerShip,
                fourDeckerField4, fourDeckerShip));
        log.info("Initialized Player1 board!");
        return board;
    }

    public static Board initPlayer2Board() {
        Field oneDeckerField1 = Field.createField("J10");

        Field twoDeckerField1 = Field.createField("G9");
        Field twoDeckerField2 = Field.createField("G10");

        Field threeDeckerField1 = Field.createField("D8");
        Field threeDeckerField2 = Field.createField("D9");
        Field threeDeckerField3 = Field.createField("D10");

        Field fourDeckerField1 = Field.createField("A1");
        Field fourDeckerField2 = Field.createField("B1");
        Field fourDeckerField3 = Field.createField("C1");
        Field fourDeckerField4 = Field.createField("D1");

        ShipPart oneDeckerShipPart1 = new ShipPart(oneDeckerField1);

        ShipPart twoDeckerShipPart1 = new ShipPart(twoDeckerField1);
        ShipPart twoDeckerShipPart2 = new ShipPart(twoDeckerField2);

        ShipPart threeDeckerShipPart1 = new ShipPart(threeDeckerField1);
        ShipPart threeDeckerShipPart2 = new ShipPart(threeDeckerField2);
        ShipPart threeDeckerShipPart3 = new ShipPart(threeDeckerField3);

        ShipPart fourDeckerShipPart1 = new ShipPart(fourDeckerField1);
        ShipPart fourDeckerShipPart2 = new ShipPart(fourDeckerField2);
        ShipPart fourDeckerShipPart3 = new ShipPart(fourDeckerField3);
        ShipPart fourDeckerShipPart4 = new ShipPart(fourDeckerField4);


        OneDeckerShip oneDeckerShip = new OneDeckerShip(Map.of(oneDeckerField1, oneDeckerShipPart1));


        TwoDeckerShip twoDeckerShip = new TwoDeckerShip(Map.of(twoDeckerField1, twoDeckerShipPart1,
                twoDeckerField2, twoDeckerShipPart2));

        ThreeDeckerShip threeDeckerShip = new ThreeDeckerShip(Map.of(threeDeckerField1, threeDeckerShipPart1,
                threeDeckerField2, threeDeckerShipPart2,
                threeDeckerField3, threeDeckerShipPart3));

        FourDeckerShip fourDeckerShip = new FourDeckerShip(Map.of(fourDeckerField1, fourDeckerShipPart1,
                fourDeckerField2, fourDeckerShipPart2,
                fourDeckerField3, fourDeckerShipPart3,
                fourDeckerField4, fourDeckerShipPart4));

        Board board = new Board(Map.of(oneDeckerField1, oneDeckerShip,
                twoDeckerField1, twoDeckerShip,
                twoDeckerField2, twoDeckerShip,
                threeDeckerField1, threeDeckerShip,
                threeDeckerField2, threeDeckerShip,
                threeDeckerField3, threeDeckerShip,
                fourDeckerField1, fourDeckerShip,
                fourDeckerField2, fourDeckerShip,
                fourDeckerField3, fourDeckerShip,
                fourDeckerField4, fourDeckerShip));
        log.info("Initialized Player2 board!");
        return board;
    }
}

