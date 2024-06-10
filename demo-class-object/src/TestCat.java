public class TestCat {
  public static void main(String[] age) {
    String name = "john";

    // Local variable / Object Reference
    Cat c1 = new Cat(); //"new Cat() produce a Cat Object in Memory
    // memory address 0x123x3Xgg"

    c1.SetAge(10);
    System.out.println(c1.getAge());
    
    // Local variable 
    Cat c2 = new Cat();
    c2.SetAge(7);

    Cat c3 = new Cat();
    
    
    System.out.println(c3.getAge());
  }
}
