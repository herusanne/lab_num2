package com.lab1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Square {
    int sideLenght;
    int perimetr;
    int area;
    int diagon;

    public double getSideLenght() {
        return sideLenght;
    }

    public void setSideLenght(int sideLenght) {
        this.sideLenght = sideLenght > 0 ? sideLenght : -1;
    }

    public int getPerimetr() {
        return perimetr;
    }

    public void setPerimetr(int perimetr) {
        this.perimetr = this.sideLenght*4;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = this.sideLenght*this.sideLenght;
    }

    public int getDiagon() {
        return diagon;
    }

    public void setDiagon(int diagon) {
        this.diagon =(int)Math.sqrt(2)*this.sideLenght;
    }
public Square(int sideLenght){
        this.setSideLenght(sideLenght);
        this.setPerimetr(this.perimetr);
        this.setArea(this.area);
        this.setDiagon(this.diagon);
}

    //@Override
    public void move(Square area) {
        System.out.println("area = " + area);
    }
/*
    //@Override
    public int getPerimetr(int perimetr) {
        perimetr = this.sideLenght*4;
        //this.perimetr=perimetr;
        return perimetr;
    }
    public int getArea(int area) {
        area = this.sideLenght*this.sideLenght;
        return area;
    }
    public double getDiagon(double diagon) {
        diagon = Math.sqrt(2)*this.sideLenght;

        return diagon;
    }
*/

}
