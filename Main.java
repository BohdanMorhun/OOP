package com.company;


public class Main {
    public static void main(String[] args) {
        Point a = new Point(2,3);
        Point b = new Point(3,5);
        Point c = new Point(6,9);
        Point d = new Point(4,8);
        Triangle tr = new Triangle(a,b,c);
        System.out.println(tr.calculateArea());
        Rectangle r = new Rectangle(a,b,c,d);
        System.out.println(r.calculateArea());
        System.out.println(r.calculatePerimetr());


    }
}

