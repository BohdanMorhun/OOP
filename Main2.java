2) Описать класс «Triangle». В качестве свойств возьмите длины сторон
треугольника. Реализуйте метод, который будет возвращать площадь этого
треугольника. Создайте несколько объектов этого класса и протестируйте их.


public class Main2 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(6,6,8);

        triangle.setC(6);
        triangle.setB(8.5);
        triangle.setA(12);
        System.out.println(triangle.Square());

      }
    }
class Triangle {

    private double a;
    private double b;
    private double c;

public Triangle(double a,double b,double c){
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


  public double Square() {
      double p = (a + b + c)/2;
      double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
      return s;

  }
}

