package org.lowLevelDesign.basics;

import org.lowLevelDesign.basics.behaviours.FlyingBehaviour;
import org.lowLevelDesign.basics.behaviours.QuackBehaviour;

public abstract class Duck {

    // separate the changing behaviour from the fixed behaviour
    FlyingBehaviour flyingBehaviour; // changing behaviour
    QuackBehaviour quackBehaviour; // changing behaviour

    //fixed behaviour
    public void swim() {
        System.out.println("The duck is swimming");
    }
    // fixed behaviour
    public abstract void display();
    public void performFly() {
        flyingBehaviour.fly();
    }
    public void performQuack() {
        quackBehaviour.quack();
    }

    // We should be able to change the behaviour of Duck at run time as well
    public void setFlyingBehaviour(FlyingBehaviour flyingBehaviour) {
        this.flyingBehaviour = flyingBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
