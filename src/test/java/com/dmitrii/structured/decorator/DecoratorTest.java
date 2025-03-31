package com.dmitrii.structured.decorator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecoratorTest {

    @Test
    public void decoratorTest() {
        Coffee coffee = new SimpleCoffee(); // base
        coffee = new MilkDecorator(coffee); // add milk
        coffee = new SugarDecorator(coffee); // add sugar

        Assertions.assertEquals(7.0, coffee.getCost());
        Assertions.assertEquals("Simple Coffee with milk with sugar", coffee.getDescription());
    }

}