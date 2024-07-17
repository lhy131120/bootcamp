public class MethodDemo {

  private String firstName;

  public MethodDemo() {

  }

  public MethodDemo(String fristName) {
    this.firstName = fristName;
  }

  // Static method 係控制status
  public static void main(String[] args) {
    int x = sum(1,2);
    Integer x2 = sum(1,2);
    long l = sum(1,2); // upcast, intvalue => long value
    // Long l2 = sum(1,2); // int value => long value => Long Object(autobox)
    // compiler woild not do upcast and auto-box at same time

    // Call static method
    MethodDemo.sum(2,3);

    // No Point to make sum2() become an instance method
    MethodDemo md = new MethodDemo();
    md.sum(2,3);

    MethodDemo md2 = new MethodDemo("John");
    String john = md2.fullName("Wong");
    System.out.println(john);
  }

  public static int sum(int x, int y) {
    return x + y;
  }

  // 無用到住何instance value，根本唔應該將佢寫成instance method ＊
  public int sum2(int x, int y) {
    return x + y;
  }

  public String fullName(String lastName) {
    return this.firstName+ " " +lastName;
  }
}
