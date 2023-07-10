package org.designPatterns.creational.singleton;

// Double Checked Locking based Java implementation of
// singleton design pattern
public class ManagerDCL {
    private ManagerDCL() { };

    private static volatile ManagerDCL managerDCL; // volatile makes sure that threads check value from main memory and not cache register

    public static ManagerDCL getInstance() {
        // Lazy initialisation
        if(managerDCL == null) {
            // To make thread safe
             synchronized (ManagerDCL.class) {
                 // check again as multiple threads
                 // can reach above step
                 if(managerDCL == null){
                     managerDCL = new ManagerDCL();
                 }

             }
        }
        return managerDCL;
    }
}
