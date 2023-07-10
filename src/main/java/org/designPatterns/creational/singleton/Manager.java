package org.designPatterns.creational.singleton;


// Singleton is actually an anti-pattern, make sure it is implemented when there is not much mutable state
public class Manager {
    private static Manager manager;
    private Manager () {};

    public static Manager getInstance() {
        // Lazy initialisation
        if(manager == null) {
            manager = new Manager();
        }
        return manager;

    }


}
