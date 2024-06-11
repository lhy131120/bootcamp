public class Calculator {

  private int x;
  private int y;

  // public static double sum(double x, double y) {
  //   return 
  // }

  // static method -> instance method ??!!
  public static int sum(int x, int y) {
    return x + y;
  }

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  public int sum() {
    return this.x + this.y;
  }

  public int multiply() {
    return this.x * this.y;
  }

  public static void main(String[] args) {

    // sysout
    // static methods
    sum(1, 3); // 4
    Calculator.sum(2, 3); // 5

    Calculator c1 = new Calculator();
    c1.setX(2);
    c1.setY(3);

    c1.sum(); // 5
    c1.multiply(); // 6

    // Method Overloading
    sum(1,2);


    // upcast 
    // overloading即是
    // Java 核心 1個method名會根據參數的不同輸出對應的結果
    // 行為一樣 不需要寫每個type的method
    // 最好的例子valueOf
  }


  public static void test(String[] args) {
    for (int i = 0; i< args.length; i++) {
      System.out.println(args[i]);
    }
  }

  public static void test2(String ...args) {
    for (String s : args) {
      System.out.println(s);
    }

    Calculator.test(new String[] {"abc", "ijk"});
    Calculator.test2("abc", "jbk");
  }

}