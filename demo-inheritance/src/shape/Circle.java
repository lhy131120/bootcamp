package shape;

import java.math.BigDecimal;

// Final Class not provide to extends
// public final class Circle extends Shape {
public class Circle extends Shape {

  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  // abstract method is not allowed in normal Class
  // public abstract String test();


  // 1. the parent class has the same method
  // 2. compile would check if the parent class really has the same method
  // 3. parent 有的method就先mark咗override

  // 如果method set咗final咁就唔準俾再繼承
  @Override
  public double area() {
    return BigDecimal.valueOf(this.radius)
            .multiply(BigDecimal.valueOf(this.radius))
            .multiply(BigDecimal.valueOf(Math.PI))
            .doubleValue();
  }

  //  Circle  class may have its own method

  public void sleep() {
    System.out.println("circle is sleeping ...");
  }

  public double getRadius() {
    return this.radius;
  }


  public static void main(String[] args) {
    Circle c1 = new Circle(3.0);
    System.out.println(c1.area());
  }
}
