package com.lab1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Square square;
        double side = -1;
        while (Square.checkSides("" + (side = Math.random() * 11 - 5)) < 0) {
            System.out.println(side);
        }
        square = new Square(side);
        Squares squares = new Squares(5);
        squares.setSquareAt(0, square);


        for (int i = 0; i < squares.getSquares().length; i++)
           System.out.println(squares.getSquares()[i]);

        squares.add(new Square(12));
        squares.add(new Square(19));
/*
        System.out.println("\nAfter add:");
        for (int i = 0; i < squares.getSquares().length; i++)
            System.out.println(squares.getSquares()[i]);

        System.out.println("\nSquares with area > average:" + squares.getAverage());
        for (int i = 0; i < squares.getSquares().length; i++)
            if (squares.getSquares()[i].getArea() > squares.getAverage())
                System.out.println(squares.getSquares()[i]);
*/

        RightSquarePrism prism = new RightSquarePrism(5, 4);
        System.out.println(prism);

        Prismas prismas = new Prismas();
        prismas.list.add(prism);
        prismas.list.add(new RightSquarePrism(10,6));
        prismas.list.add(new RightSquarePrism(3,7));

        System.out.println("\nList of prismas:");
        for (int i = 0; i < prismas.list.size(); i++)
            System.out.println(prismas.list.get(i));
        //System.out.println(square);
/*
        boolean isNotCorrect=true;
        while (isNotCorrect){
            System.out.println("Please, input the quantity of squares: " );
            String str=scanner.next();
         //   isNotCorrect=
        }
*/
    }
}
