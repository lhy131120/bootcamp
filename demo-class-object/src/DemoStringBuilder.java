public class DemoStringBuilder {
  public static void main(String[] args) {
    String x = "hello"; //slow performance: i.e: concat, replace,

    // this is Class
    StringBuilder sb = new StringBuilder("hello"); //faster performance
    sb.append(" world!");
    // sb.replace(1, 5, "xx");
    sb.setCharAt(0, 'x');
    System.out.println(sb.toString());

    sb.insert(0, "Java ");
    System.out.println(sb.toString());
  }
}
