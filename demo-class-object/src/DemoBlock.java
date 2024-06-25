public class DemoBlock {
  // private static int number; 
  // private static int numbers;
  private String name;

  // trigger one only, no matter the number of static variables, even no static variable exist
  static {
    System.out.println("start static block");
    // number = 3;
    System.out.println("end static block");
  }

  // instance block, ~ relatonship on instance constructor
  // it's triggered when there is create new object created
  // it's triggered before constructor
  // Usage: common logic between constructors 
  {
    System.out.println("start instance block");
    this.name = "John";
    System.out.println("end instance block");
    // number = 10;
  }

  public DemoBlock() {
    System.out.println("calling constructor......");
  }

  public DemoBlock(String name) {
    this.name = name;
  }

  public static void main(String[] args) {
    System.out.println("start.");
    // System.out.println(DemoBlock.number);  // 3
    System.out.println("end.");  // 3

    DemoBlock db = new DemoBlock();
    DemoBlock db2 = new DemoBlock("Marc");
    DemoBlock db3 = new DemoBlock();
    // System.out.println(DemoBlock.number);


  }
}
