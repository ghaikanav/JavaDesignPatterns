package org.lowLevelDesign.strategy.behaviours.impl;

import org.lowLevelDesign.strategy.behaviours.QuackBehaviour;

public class QuackSqueak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squeak Squeak Squeak");
    }
}
