package com.lab1;

import com.lab1.Square;

import java.util.Arrays;

    public class Squares {
        public Square[] getSquares() {
            return squares;
        }
       public void setSquareAt(int index, Square square)
       {
           squares[index] = square;
       }

        public void add(Square square)
        {
            int n = 0;
            for (Square square1 : squares)
                if (square1 == null)
                    break;
                else
                    n++;

          //  if (squares.length == n)
           //    resize(n+1);

            setSquareAt(n, square);
        }
        public void resize(int newLength)
        {
            Square [] tempSquares = new Square[newLength];
            {
                tempSquares = Arrays.copyOf(squares, newLength);
            }
            squares = tempSquares;
        }
        public double getAverage()
        {
            double area = 0;
            for (int i = 0; i < squares.length; i++) {
                area+=squares[i].getArea();
            }
            return area/squares.length;
        }
        private Square[] squares;
        public Squares() {
            squares = new Square[0];
        }
        public Squares(int length) {
            this.squares = new Square[length];
        }
}
