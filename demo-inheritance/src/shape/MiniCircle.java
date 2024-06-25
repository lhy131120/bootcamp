package shape;

public class MiniCircle extends Circle{

  private String color;

  public MiniCircle(double radius, String color) {
    // 我地唔需要this radius, 因為parent果到已經有
    super(radius);
    this.color = color;
  }

  public static void main(String[] args) {
    MiniCircle mc = new MiniCircle(3.0d, "#FF0000");
    System.out.println(mc.getRadius());
    System.out.println(mc.area());
  }
}
