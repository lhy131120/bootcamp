public class Demo {
  // Inner Class(nor-static)
  public static void main(String[] args) {
    // Box box = new Box();
    // Box.Ball ball = box.new Ball();
    // System.out.println();

    Swim john = new Swim() {
      @Override
      public void swim() {
        System.out.println("John is swimming");
      }
    };

    john.swim();

    Swim sally = new Swim() {

      // private String name = "Sally";

      @Override
      public void swim() {
        System.out.println("John is swimming");
      }
    };

    sally.swim();
  }
}
