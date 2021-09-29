package com.lab1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Square {
    double sideLenght;
    public  Square() {
    }
    public  Square(double sideLenght) {this.sideLenght = sideLenght;}
    public static double checkSides(String value){
        double side = -1;
        try {
            side = Double.parseDouble(value) > 0 ? Double.parseDouble(value) : -1;
        } catch (Exception e) {

        }
        return side;
    }

    public double getSideLenght() {
        return sideLenght;
    }

    public void setSideLenght(double sideLenght) {
        this.sideLenght = sideLenght > 0 ? sideLenght : -1;
    }

    public double getPerimetr() {
        return this.sideLenght*4;
    }


    public double getArea() {
        return this.sideLenght*this.sideLenght;
    }


    public double getDiagon() {
        return Math.sqrt(2)*this.sideLenght;
    }


    @Override
    public String toString() {
        return this.sideLenght>0 ?
         String.format("Square:" +
                "\nside =" + String.format("%6.2f",this.sideLenght) +
                "\nperimetr =" + String.format("%6.2f",getPerimetr()) +
                "\narea =" + String.format("%6.2f",getArea()) +
                "\ndiagonal =" + String.format("%6.2f",getDiagon())
                ): "Error: side = " + this.sideLenght;
    }
}
