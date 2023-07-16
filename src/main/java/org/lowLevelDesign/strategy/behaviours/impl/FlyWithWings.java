package org.lowLevelDesign.strategy.behaviours.impl;

import org.lowLevelDesign.strategy.behaviours.FlyingBehaviour;

public class FlyWithWings implements FlyingBehaviour {
    @Override
    public void fly() {
        System.out.println("Flying with wings!");
    }
}
