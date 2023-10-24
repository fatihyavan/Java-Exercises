package org.example;

import Entity.Duck;
import Entity.RedHeadDuck;
import Entity.RobotDuck;

public class Main {
    public static void main(String[] args) {

        Duck redHead = new RedHeadDuck();
        redHead.display();
        redHead.performFly();
        redHead.performQuack();
        Duck robotDuck = new RobotDuck();
        robotDuck.display();
        robotDuck.performQuack();
        robotDuck.performFly();
    }
}