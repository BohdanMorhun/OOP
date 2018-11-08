2) Описать класс «Triangle». В качестве свойств возьмите длины сторон
треугольника. Реализуйте метод, который будет возвращать площадь этого
треугольника. Создайте несколько объектов этого класса и протестируйте их.


public class Main2 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        triangle.setArea(4,5,4);
        System.out.println(triangle.getArea());

      }
    }
class Triangle{

 private double a;
 private double b;
 private double c;


public void setArea(double a,double b, double c){
    this.a = a;
    this.b = b;
    this.c = c;

}

  public double getArea() {
      double p = (a + b + c)/2;
      double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
      return s;

  }
}
