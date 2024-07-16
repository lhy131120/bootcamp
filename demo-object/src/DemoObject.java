import java.util.Scanner;

public class DemoObject {
  
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();

    Scanner scanner = new Scanner(System.in);

    Object object = new Object(); // Object is the top of java tree
    object = "avc";
    object = 1;
    object = new Monster();
    Monster m1 = new Monster();
    Monster m2 = new Monster();

    // default toString print object address @323213
    // custom toString 
    // System.out.println(new Monster().toString());

    // System.out.println(m1.hashCode());
    // System.out.println(m2.hashCode()); //大部分 hashcode 都係object reference；

    String x1 = new String("abc");
    // System.out.println(x1.hashCode()); // 96354
    String x2 = new String("abc");
    // System.out.println(x2.hashCode()); // 96354
    // System.out.println(x1 == x2); // false

    MiniMonster mi1 = new MiniMonster("AI", "Red");
    MiniMonster mi2 = new MiniMonster("AI", "Red");
    MiniMonster mi3 = new MiniMonster("A3123I", "Blue");

    System.out.println(mi1.hashCode());
    System.out.println(mi2.hashCode());
    System.out.println(mi3.hashCode());



    // **********************************************************************
    Object cat = new Cat();
    // cat (object reference) indeed pointing ti cat object
    // run() that instance method canc only called by object declared by Cat.class
    // if the object reference is declared by Object .class , it cannot call run() method
    // cat.run(); //compile time error => 決定類型OK / NOT
    // run time error => 執行的 

    // downcast 
    Cat cat2 = (Cat) cat; // Reason why compile error:  

    cat2.hashCode();
    // cat2.equals();

    // between difference 
    //thie dirffenence between 
    // Object vs Object reference

  }

  

  // 直至compile time, Java 都唔sure the object 是什麼type 
  // JAVA Strong Type Language, Ensue Type Safty during compile time, so not all can use Object to define
  // public static Object sum(Object x , Object y) {
  //   return x + y;  // operations => String, Integer, int, Double, double
  // }

  public static int length(String x) {
    return x.length();
  }
}
