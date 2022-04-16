package com.company;

public class Daire {
    public int r;

    public Daire(int r) {
        this.r = r;
    }

    public void calcArea() {
        double area = 3.14 * this.r * this.r;
        System.out.println(area);
    }
}
