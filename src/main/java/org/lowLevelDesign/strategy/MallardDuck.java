package org.lowLevelDesign.strategy;

import org.lowLevelDesign.strategy.behaviours.FlyingBehaviour;
import org.lowLevelDesign.strategy.behaviours.QuackBehaviour;
import org.lowLevelDesign.strategy.behaviours.impl.FlyWithWings;
import org.lowLevelDesign.strategy.behaviours.impl.QuackClassic;

public class MallardDuck extends Duck{

    // Default constructor, ideally we should be using interfaces and not concrete classes
    public MallardDuck () {
        this.flyingBehaviour = new FlyWithWings();
        this.quackBehaviour = new QuackClassic();
    }

    // Resolve the problem of concrete class, also incorporated dependency injection
    public MallardDuck (FlyingBehaviour fb, QuackBehaviour qb) {
        this.flyingBehaviour = fb;
        this.quackBehaviour = qb;
    }
    @Override
    public void display() {
        System.out.println("This is a Mallard duck!");
    }

}
