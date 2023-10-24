package Entity;

import Encapsulation.IFlyBehaviors;
import Encapsulation.IQuackBehaviors;

public abstract class Duck {
    IFlyBehaviors iFlyBehaviors;
    IQuackBehaviors iQuackBehaviors;
    public Duck(){

    }
    public abstract void display();
    public void performFly(){
        iFlyBehaviors.fly();
    }
    public void performQuack(){
        iQuackBehaviors.quack();
    }
    public void swim(){
        System.out.println("All ducks can swim..");
    }
}
