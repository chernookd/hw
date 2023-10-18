package edu.hw2.task2;

public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
    }

    public Square setWidth(int width) {
        return new Square(width);
    }

    public Square setHeight(int height) {
        return new Square(height);
    }
}

