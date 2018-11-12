package com.company;

 public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c, double x, double y) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

     public double getA() {
         return a;
     }

     public void setA(double a) {
         this.a = a;
     }

     public double getB() {
         return b;
     }

     public void setB(double b) {
         this.b = b;
     }

     public double getC() {
         return c;
     }

     public void setC(double c) {
         this.c = c;
     }

     public double calculatePerimetr(){
        return a+b+c;
    }
    public double calculateArea(){
        double polP=(a+b+c)/2;
        return Math.sqrt(polP*(polP-a)*(polP-b)*(polP-c));
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
