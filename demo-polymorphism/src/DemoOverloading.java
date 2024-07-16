public class DemoOverloading {

  private int a;
  private int b;


  public DemoOverloading () {
    // default value

    // this.a = 100;
    // this.b = 100;
    this(100, 100);
  }

  public DemoOverloading(double a) {
    // this.a = a;
    this.b = 100;
  }
  public DemoOverloading(int a, int b) {
    this.a = a; 
    this.b = b;
  }

  public static int sum(int x, int y) {
    return x + y;
  }

  public static double sum(double x, double y) {
    return x + y;
  }

  public static void sum(Object x, Object y) {
    System.out.println("calling void sum(Object x, y)");
  }

  public static void sum(Animals x, Animals y) {

  }

  public static long sum (int x, long y) {
    return x + y;
  }

  public static long sum (long x, int y) {
    return x + y;
  }

  // Static polymophism
  // Overload is designed and checked during compile time
  public static void main(String[] args) {

    // 用家角度出發
    String a = String.valueOf(true); // true
    String b = String.valueOf(2.0d); // 2

    char[] arr = new char[] {'c','b','a'};
    // System.out.println(String.valueOf(arr));

    // System.out.println(sum((byte)3, (short)9.213));

    sum("defsdf", "dsad");

    // Wrapper Class???????

  }
}
