package org.example.Condiment;

import org.example.Coffee.Beverage;

public class Mocha extends CondimentDecorator{
    Beverage beverage;
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return beverage.cost() + 0.25;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "Mocha";
    }
}
