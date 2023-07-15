package org.lowLevelDesign.basics.behaviours.impl;

import org.lowLevelDesign.basics.behaviours.QuackBehaviour;

public class QuackSqueak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squeak Squeak Squeak");
    }
}
