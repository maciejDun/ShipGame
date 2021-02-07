package com.example.battleship.game;

import java.util.List;
import java.util.Map;

public class BoardService {


    public static Board initPlayer1Board(){
        Field oneDeckerField1 = new Field("A1");

        Field twoDeckerField1 = new Field("D1");
        Field twoDeckerField2 = new Field("D2");

        Field threeDeckerField1 = new Field("G1");
        Field threeDeckerField2 = new Field("G2");
        Field threeDeckerField3 = new Field("G3");

        Field fourDeckerField1 = new Field("J1");
        Field fourDeckerField2 = new Field("J2");
        Field fourDeckerField3 = new Field("J3");
        Field fourDeckerField4 = new Field("J4");

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
        System.out.println("Initialized Player1 board!");
    return board;
    }
    public static Board initPlayer2Board(){
        Field oneDeckerField1 = new Field("J10");

        Field twoDeckerField1 = new Field("G9");
        Field twoDeckerField2 = new Field("G10");

        Field threeDeckerField1 = new Field("D8");
        Field threeDeckerField2 = new Field("D9");
        Field threeDeckerField3 = new Field("D10");

        Field fourDeckerField1 = new Field("A1");
        Field fourDeckerField2 = new Field("B1");
        Field fourDeckerField3 = new Field("C1");
        Field fourDeckerField4 = new Field("D1");

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
        System.out.println("Initialized Player2 board!");
        return board;
//        OneDeckerShip oneDeckerShip = new OneDeckerShip(List.of(new ShipPart(new Field("J10"))));
//
//        TwoDeckerShip twoDeckerShip = new TwoDeckerShip(List.of(new ShipPart(new Field("G9")),
//                new ShipPart(new Field("G10"))));
//
//        ThreeDeckerShip threeDeckerShip = new ThreeDeckerShip(List.of(new ShipPart(new Field("D8")),
//                new ShipPart(new Field("D9")),
//                new ShipPart(new Field("D10"))));
//
//        FourDeckerShip fourDeckerShip = new FourDeckerShip(List.of(new ShipPart(new Field("A1")),
//                new ShipPart(new Field("B1")),
//                new ShipPart(new Field("C1")),
//                new ShipPart(new Field("D1"))));
//
//        Board board = new Board(Map.of(oneDeckerShip.getShipField(0), oneDeckerShip,
//                twoDeckerShip.getShipField(0), twoDeckerShip,
//                twoDeckerShip.getShipField(1), twoDeckerShip,
//                threeDeckerShip.getShipField(0), threeDeckerShip,
//                threeDeckerShip.getShipField(1), threeDeckerShip,
//                threeDeckerShip.getShipField(2), threeDeckerShip,
//                fourDeckerShip.getShipField(0), fourDeckerShip,
//                fourDeckerShip.getShipField(1), fourDeckerShip,
//                fourDeckerShip.getShipField(2), fourDeckerShip,
//                fourDeckerShip.getShipField(3), fourDeckerShip));
//        System.out.println();
//        return board;
    }
}
