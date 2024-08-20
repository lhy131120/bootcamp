package shape;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class Shape {
  abstract double area();

  // public Shape() {}

  public static double area(List<Shape> shapes){
    BigDecimal bd = BigDecimal.valueOf(0.0);
    for(Shape shape : shapes) {
      // bd 唔需要new
      bd = bd.add(BigDecimal.valueOf(shape.area()));
    }
    return bd.doubleValue();
  }

  //  approach2
  // <T extends Shape> is to describe the parent relationship
  public static <T extends Shape> double area2(List<T> shapes) {
    BigDecimal bd = BigDecimal.valueOf(0.0);
    for(Shape shape : shapes) {
      // bd 唔需要new
      bd = bd.add(BigDecimal.valueOf(shape.area()));
    }
    return bd.doubleValue();
  }

  // List<Object> vs List<T> different

  public static double area3(List<? extends Shape> shapes){
    return -1.0;
  }

  public static void main(String[] args) {
    // Circle vs Shape -> Parent relationship
    // List <Shape> vs Lsit<Circle> => NOT Parent
    List<Shape> shapes = new LinkedList<>();
    shapes.add(new Circle(3.0));
    shapes.add(new Circle(4.2));

    // Static method called by type not Class
    System.out.println(Shape.area(shapes));
    System.out.println(Shape.area2(shapes));

    // ArrayList<Circle
    // 佢唔知你係咩List
    // ? super 仲未決定係咩類，所以
    List<? extends Shape> shapes2 = new ArrayList<Circle>();
    shapes2 = new ArrayList<Square>();
    // shapes2.add(new circle(5.0)); // NOT OK
    // shapes2.add(new Square(4.0)); // NOT OK
    shapes2.add(null);

    List<? super Shape> shapes3 = new ArrayList<Object>();
    shapes3 = new ArrayList<Shape>();
    shapes3.add(new Circle(3.4));
    shapes3.add(new Square(3.2));
    // shapes3.add(new Bird()); // NOT OK

    // List<Object> objects = new ArrayList<Circle>(); // NOT OK (Parent)
    Object object = new Circle(2.43); // OK (Parent Relationship )
  
    }
  }