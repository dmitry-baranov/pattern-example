package com.dmitrii.structured.adapter;

public class SquarePeg {

    private final double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth(){
        return width;
    }

    public double getSquare(){
        double result;
        result = Math.pow(width, 2);
        return result;
    }
}
