import java.math.BigDecimal;

public class StringDemo {
  public static void main(String[] args) {
    String s = "hello";
    String s1=  s.concat("world"); // concat() method return new String Object, no impact to s

    // String的世界中，指向一個就永遠keep住指果只object reference
    System.out.println(s1); // s1 is an object reference

    StringBuilder sb = new StringBuilder("hello");
    sb.append("world"); // StringBuilder already change the value itself, that no need to create somthing to store it 
    System.out.println(sb);
    sb.append("!!!!");
    System.out.println(sb);

    BigDecimal bd = BigDecimal.valueOf(3.3);
    BigDecimal bd2 = BigDecimal.valueOf(3.4);
    bd.add(bd2); // you have to worry about the impact on bd. // Is bd is 6.7?

    BigDecimal bd3 = bd.multiply(BigDecimal.valueOf(2.0)); // 6.6?  6.60?
    System.out.println(bd3);

  }
}
