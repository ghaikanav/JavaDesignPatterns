package org.designPatterns.creational.singleton;


public class ManagerEager {
    private ManagerEager () {};

    private static ManagerEager managerEager = new ManagerEager(); // Eager initialisation, thread safe, preferred method

    public static ManagerEager getInstance() {
        return managerEager;
    }
}
