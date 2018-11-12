package com.company;

  public class Rectangle extends Shape {
      private double a;
      private double b;
      private double c;
      private double d;

      public Rectangle(double a, double b, double c, double d, double x, double y) {
          super();
          this.a = a;
          this.b = b;
          this.c = c;
          this.d = d;
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

      public double getD() {
          return d;
      }

      public void setD(double d) {
          this.d = d;
      }

      @Override
      double calculateArea() {
          double s = a * b;
          return s;
      }

      public double calculatePerimetr(){
          return (a + b) * 2;
      }

      @Override
      public String toString() {
          return "Rectangle{" +
                  "a=" + a +
                  ", b=" + b +
                  ", c=" + c +
                  ", d=" + d +
                  '}';
      }
  }
