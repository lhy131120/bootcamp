package shape;

import java.math.BigDecimal;

public class Square extends Shape {
  private double height;

  
  public Square(double height) {
    this.height = height;
  }

  @Override
  public double area() {
    return BigDecimal.valueOf(this.height)
          .multiply(BigDecimal.valueOf(this.height))
          .doubleValue();
  }

  public static void main(String[] args) {
    Square square = new Square(5.0);
    System.out.println(square.area());
  }
}
