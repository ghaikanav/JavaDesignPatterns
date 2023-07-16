package org.lowLevelDesign.strategy.behaviours.impl;

import org.lowLevelDesign.strategy.behaviours.FlyingBehaviour;

public class FlyNoWay implements FlyingBehaviour {
    @Override
    public void fly() {
        System.out.println("Can't fly!");
    }
}
