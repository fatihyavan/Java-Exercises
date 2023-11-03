package org.example.Condiment;

import org.example.Coffee.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
}
