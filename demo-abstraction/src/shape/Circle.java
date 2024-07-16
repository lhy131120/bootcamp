package shape;

import java.math.BigDecimal;

public class Circle implements Shape {
  // instance method
  private double radius;


  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double area() {
    return BigDecimal.valueOf(this.radius) //
        .multiply(BigDecimal.valueOf(this.radius)) //
        .multiply(BigDecimal.valueOf(Math.PI)) //
        .doubleValue();
  }

}
