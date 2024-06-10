import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args) {
    double x = 0.2;
    double y = 0.1;
    System.out.println(x * y);

    BigDecimal b1 = new BigDecimal("0.2");
    BigDecimal b2 = new BigDecimal("0.1");

    BigDecimal b3 = b1.multiply(b2);
    System.out.println(b3.doubleValue());

    System.out.println(sum(0.3, 0.4));
    System.out.println(divide(9.3, 3.3));
    
  }

  public static double sum(double d1, double d2) {
    BigDecimal b1 = BigDecimal.valueOf(d1);
    BigDecimal b2 = BigDecimal.valueOf(d2);
    return b1.add(b2).doubleValue();
  }

  public static double divide(double d1, double d2) {
    // return BigDecimal.valueOf(d1).divide(BigDecimal.valueOf(d2), RoundingMode.DOWN).doubleValue();
    return BigDecimal.valueOf(d1)
              // handle non-terminating decimal expansion (i.e. 10 /3)
            .divide(BigDecimal.valueOf(d2), RoundingMode.UP)
              // decmical place, the wayto round the result 
            .setScale(3, RoundingMode.UP)
              // convert from BigDecimal to double
            .doubleValue();
  }

  // 有可能先X除後加減
  public static double maxAll(double n1, double n2) {
    return BigDecimal.valueOf(n1)
              .divide(BigDecimal.valueOf(n2), RoundingMode.DOWN)
              .doubleValue();
  }
}
