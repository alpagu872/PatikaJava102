package com.company;

public class Player {
    public String name;
    public int id;

    public static String gameName = "CS";
    //Static değişkenler sınıflara aittirler, ve nesnelerde bağımsızdırlar.

    public static int count = 21;


    public Player(String name, int id) {
        this.id = id;
        this.name = name;
    }

    public void login() {
        count++;
    }

    public static void showName() {
        Player p1 = new Player("a",1);
        System.out.println(p1.name);
    }
}
