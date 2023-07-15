package org.lowLevelDesign.basics.behaviours.impl;

import org.lowLevelDesign.basics.behaviours.QuackBehaviour;

public class QuackClassic implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack quack quack!");
    }
}
