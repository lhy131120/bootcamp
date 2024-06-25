public class DemoStaticFinal {
  // Constant 常量 // snakecase
  private static final String LOGO_STRING; // static variables, finalized
  private static String name;  // Static variables / (Class variable)
  private final double salary = 0.0d; // finalized instance variables
  private int age;
  
  // Final - a keyword that compiler would check all final variable has been init
  // must define variable first

  // Before programe run that should be exist, so it not suitable define on main Program.
  static {
    LOGO_STRING = "default";
  }

  public int getAge() {
    return this.age;
  }

  public double getSalary() {
    return this.salary;
  }

  public String test() {
    return this.age + " " + name + " " + this.salary + " " + LOGO_STRING;
  }

  public static String getName() {
    return name;
  }

  public static String getLogo() {
    return LOGO_STRING;
  }

  public static void main(String[] args) {
    DemoStaticFinal dm = new DemoStaticFinal();
    dm.age = 10;
    // dm.salary = 1000; // compile error. can't overwrite; link ES6 const variable

    DemoStaticFinal dm2 = new DemoStaticFinal();
    dm.age = 20;

    DemoStaticFinal.name = "Vincent";

    System.out.println(DemoStaticFinal.LOGO_STRING);
  }
}
