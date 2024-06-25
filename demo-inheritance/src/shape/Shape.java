package shape;

import java.math.BigDecimal;

public abstract class Shape {
  public abstract double area();

   //  Static method 任何地方都call到, 所以唔應該有this,因為佢無需object call
  public static double circleArea(double radius) {
    return BigDecimal.valueOf(radius)
            .multiply(BigDecimal.valueOf(radius))
            .multiply(BigDecimal.valueOf(Math.PI))
            .doubleValue();
  }

  // public static double totalArea(Circle[] circles) {

  // }

  // public static double totalArea(Square[] squares) {

  // }

  // 如果無abstract

  public static double totalArea(Shape[] shapes) {
    BigDecimal bd = BigDecimal.valueOf(0.0d);
    for(Shape s : shapes) {
      bd = bd.add(BigDecimal.valueOf(s.area()));
    }
    return bd.doubleValue();
  }

  // StringBuilder 為何不用 sb = sb.append("String");
  // BigDecima 需要  bd = bd.add(xxxxx)
}
