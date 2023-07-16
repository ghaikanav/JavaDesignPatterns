package org.lowLevelDesign.strategy.behaviours.impl;

import org.lowLevelDesign.strategy.behaviours.QuackBehaviour;

public class QuackClassic implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack quack quack!");
    }
}
