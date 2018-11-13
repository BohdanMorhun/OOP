package com.company;

 public class Triangle extends Shape{
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

     public Point getA() {
        return a;
     }

     public void setA(Point a) {
         this.a = a;
     }

     public Point getB() {
         return b;
     }

     public void setB(Point b) {
        this.b = b;
     }

     public Point getC() {
         return c;
     }

     public void setC(Point c) {
        this.c = c;
     }
     public double calculatePerimetr() {
         return Point.getLenght(a, b) + Point.getLenght(c, b) + Point.getLenght(a, c);
     }

    public double calculateArea(){
        double polP=calculatePerimetr()/2;
        return Math.sqrt(polP*(polP - Point.getLenght(a,b)*(polP-Point.getLenght(c,b))*(polP-Point.getLenght(a,c))));
    }

     @Override
     public String toString() {
         return "Triangle{" +
                 "a=" + a +
                 ", b=" + b +
                 ", c=" + c +
                 '}';
     }
 }
