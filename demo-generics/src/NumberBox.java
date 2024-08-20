import java.math.BigDecimal;

public class NumberBox<T extends Number> {
  private T number;
  public NumberBox(T number) {
    this.number = number;
  }

  public static void main(String[] args) {
    NumberBox<Byte> bytBox = new NumberBox<Byte>((byte) 1); // int => byte => Byte 
    // NumberBox<Byte> has no relationship with NumberBox<Long>
    NumberBox<BigDecimal> bBox = new NumberBox<BigDecimal>(BigDecimal.valueOf(3.4));

    System.out.println(bBox);
  }
}
