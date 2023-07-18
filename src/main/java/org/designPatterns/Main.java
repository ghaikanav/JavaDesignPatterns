package org.designPatterns;

import org.designPatterns.creational.builder.User;
import org.designPatterns.creational.singleton.Manager;
import org.designPatterns.creational.singleton.ManagerDCL;
import org.designPatterns.creational.singleton.ManagerEager;
import org.lowLevelDesign.observer.CurrentConditionsDisplay;
import org.lowLevelDesign.observer.Observer;
import org.lowLevelDesign.observer.WeatherData;
import org.lowLevelDesign.strategy.Duck;
import org.lowLevelDesign.strategy.MallardDuck;
import org.lowLevelDesign.strategy.behaviours.impl.FlyWithWings;
import org.lowLevelDesign.strategy.behaviours.impl.QuackClassic;
import org.lowLevelDesign.strategy.behaviours.impl.QuackSqueak;


public class Main {
    public static void main(String[] args) {

        // Builder
        User user = User.builder().name("Kanav").id(123).build();
        System.out.println("Hello " + user.getName() + ". Your id is " + user.getId());

        // Singleton

        Manager manager1 = Manager.getInstance();
        Manager manager2 = Manager.getInstance();

        System.out.println(manager1 == manager2);

        ManagerDCL managerDCL1 = ManagerDCL.getInstance();
        ManagerDCL managerDCL2 = ManagerDCL.getInstance();

        System.out.println(managerDCL1 == managerDCL2);

        ManagerEager managerEager1 = ManagerEager.getInstance();
        ManagerEager managerEager2 = ManagerEager.getInstance();

        System.out.println(managerEager1 == managerEager2);

        // Strategy

        Duck myDuck = new MallardDuck(new FlyWithWings(), new QuackClassic());

        myDuck.display();
        myDuck.swim();
        myDuck.performFly();
        myDuck.performQuack();
        myDuck.setQuackBehaviour(new QuackSqueak());
        myDuck.performQuack();

        // Observer

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay =  new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(32.4f, 12.3f);
        weatherData.setMeasurements(23.5f, 3.4f);
        weatherData.removeObserver(currentConditionsDisplay);
        weatherData.setMeasurements(21.1f, 2.2f);
    }
}