package org.lowLevelDesign.basics.behaviours.impl;

import org.lowLevelDesign.basics.behaviours.FlyingBehaviour;

public class FlyNoWay implements FlyingBehaviour {
    @Override
    public void fly() {
        System.out.println("Can't fly!");
    }
}
