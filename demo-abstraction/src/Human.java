public class Human extends SuperHuman implements Walkable, Readable{ //  主要是common attribute

  // Point Class can only inherit instance methods, instance variables.
  // Constructor CANNOT be inherit
  public Human(double height) {
    super(height);
  }

  // 如果想empty constructor
  public Human() {
    
  }

  @Override
  public void read() {

  }

  // Override 必定要跟原來有分別
  @Override
  public double getHeight() {
    return super.getHeight();
  }

  @Override 
  public void walk() {
    System.out.println("Human is walking");
  }

  public static void main(String[] args) {
    Human human = new Human();
    human.walk();
    human.run();


    Superman superman = new Superman();
    superman.run();
  }
}
