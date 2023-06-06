package org.designPatterns;

import org.designPatterns.creational.builder.User;

public class Main {
    public static void main(String[] args) {
        User user = User.builder().name("Kanav").id(123).build();
        System.out.println("Hello " + user.getName() + ". Your id is " + user.getId());
    }
}