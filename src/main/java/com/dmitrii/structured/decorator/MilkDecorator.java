package com.dmitrii.structured.decorator;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " with milk";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 1.5;
    }
}
