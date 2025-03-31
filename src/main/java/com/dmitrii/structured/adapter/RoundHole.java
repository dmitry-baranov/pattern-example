package com.dmitrii.structured.adapter;

public class RoundHole {
    private final double radius;

    public RoundHole(double radius){
        this.radius = radius;
    }

    public boolean fits(RoundPegInterface peg){
        boolean result;
        result = radius >= peg.getRadius();
        return result;
    }
}
