package com.lab1;

public class RightSquarePrism extends Square{
    int height;
    int capacity;


    public  RightSquarePrism(int sideLenght){
    super(sideLenght);
    this.setHeight(height);
    this.setCapacity(capacity);
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height > 0 ? height : -1;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = area*this.height;
    }

    @Override
    public void move(Square side) {
        super.move(side);
        System.out.println(this.getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return "RightSquarePrism{" + "capacity=" + capacity + '}';
    }
}
