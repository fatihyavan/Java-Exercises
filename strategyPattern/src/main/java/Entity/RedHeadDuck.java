package Entity;

import Encapsulation.FlyNoWay;
import Encapsulation.IFlyBehaviors;
import Encapsulation.IQuackBehaviors;
import Encapsulation.Quack;

public class RedHeadDuck extends Duck{

    public RedHeadDuck(){
        iFlyBehaviors = new FlyNoWay();
        iQuackBehaviors = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I am a red head duck");
    }
}
