package Entity;

import Encapsulation.FlyWithRocket;
import Encapsulation.Squeak;

public class RobotDuck extends Duck{
    public RobotDuck(){
        iFlyBehaviors = new FlyWithRocket();
        iQuackBehaviors = new Squeak();
    }
    @Override
    public void display() {
        System.out.println("I am a robot duck");
    }
}
