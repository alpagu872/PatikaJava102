package com.company;

public class User {

    public String name;
    public static int counter = 0;


    public User(String name) {
        this.name = name;
        counter++;
    }

    static {
        int random = (int) (Math.random() * 100);
        System.out.println("Random sayı: "+ random);
    }

}
