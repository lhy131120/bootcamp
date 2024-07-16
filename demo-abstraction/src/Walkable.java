public interface Walkable {
  // 類似合約，
  // 唔係class，所以不能new

  // 特性 
  // 1. no instance variable
  // 2. all methods are abstract implicitly
  // 3. you can still declare " public static final"
  // 4. A class can implements more than 1 interface, but 


  // 即是 public static final int number = 3 
  // Constant 
  int AGE = 3; 

  // abstract
  void walk();

  // Backward Compatibility
  // ******************************default 同 static 之間的分別************************
  default void run() {
    System.out.println("I am running");
  }

  static void swim() {
    System.out.println("I am swimming");
  }
  

  // 無可能的事
  // default static void read() {

  // }
}
