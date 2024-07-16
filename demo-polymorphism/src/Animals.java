public class Animals {
  public void walk() {
    System.out.println("Animals is walk");
  }

  public static void main(String[] args) {
    Animals animal = new Cat();
    animal.walk();

    // 
    Animals animal2 = new Animals();
    animal2.walk();

    // animal = new Dog();
    animal.walk();
    // compile time error because 
    
  }
}
