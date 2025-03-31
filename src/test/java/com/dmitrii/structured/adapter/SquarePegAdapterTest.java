package com.dmitrii.structured.adapter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquarePegAdapterTest {

    @Test
    public void testAdapter(){
        RoundHole roundHole = new RoundHole(10.1);
        SquarePeg squarePeg = new SquarePeg(9.8);
        SquarePegAdapter adapter = new SquarePegAdapter(squarePeg);

        assertTrue(roundHole.fits(adapter));
    }

}