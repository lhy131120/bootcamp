package shape;

public class ShapeManager {
  private Shape shape; // attribute can be an interface

  // Design implication
  // 

  public ShapeManager(Shape shape) {
    this.shape = shape;
  }

  public void setShape(Shape shape) {
    this.shape = shape;
  }

  public boolean isTooBig() {
    return this.shape.area() > 20.0;
  }

  public static void main(String[] args) {
    Circle c1 = new Circle(3.0);
    ShapeManager shapeManager = new ShapeManager(c1);
    System.out.println(shapeManager.isTooBig()); // true
  }


}