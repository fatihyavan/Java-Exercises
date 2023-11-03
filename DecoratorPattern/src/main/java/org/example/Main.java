package org.example;

import org.example.Coffee.Beverage;
import org.example.Coffee.Espresso;
import org.example.Condiment.Mocha;

public class Main {
    public static void main(String[] args) {
        Beverage espressoMocha = new Espresso();
        espressoMocha = new Mocha(espressoMocha);
        espressoMocha = new Mocha(espressoMocha);
        System.out.println(espressoMocha.cost() + espressoMocha.getDescription());
    }
}