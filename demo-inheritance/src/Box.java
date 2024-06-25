import java.math.BigDecimal;

public class Box {
  private String x;

  public Box() {
    this.x = "";
  }

  public Box append(String y) {
    this.x += y;
    return this;
  }

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    sb.append("hello");
    System.out.println(sb);

    Box box = new Box();
    box.append("hello");    // 修改緊自身
    System.out.println(box);

    BigDecimal bd = new BigDecimal(0.0d);
    BigDecimal bd2 =  bd.add(BigDecimal.valueOf(1.0d));  // ===> 佢同StringBuilder的分別在於佢會return new BigDecimal, 所以要有搵個野接住 

    System.out.println(bd.doubleValue());
    System.out.println(bd2.doubleValue());
  }
}
