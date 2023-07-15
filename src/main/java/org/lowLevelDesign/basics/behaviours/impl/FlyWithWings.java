package org.lowLevelDesign.basics.behaviours.impl;

import org.lowLevelDesign.basics.behaviours.FlyingBehaviour;

public class FlyWithWings implements FlyingBehaviour {
    @Override
    public void fly() {
        System.out.println("Flying with wings!");
    }
}
