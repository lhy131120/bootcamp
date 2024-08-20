package shape;

public class Circle extends Shape{

  private double radius;

  public Circle(double radius) {
    //super() // 可有可無
    this.radius = radius;
  }

  @Override
  public double area() {
    return this.radius * this.radius * Math.PI;
  }
}
