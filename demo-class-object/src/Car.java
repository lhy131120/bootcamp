public class Car {
  private static int count = 0; // 唔會overwrite？
  private int id;
  private String color; 

  public Car(String color){
   // this.count++;
   // this.id = Car.count;
    this.id = ++count;
    this.color = color;
  }

  public String toString() {
    return "Car( id" + this.id + ", Color is "+ this.color +")";
  }


  public static void main(String[] args) {
    Car c1 = new Car("Red");
    Car c2 = new Car("Blue");
    Car c3 = new Car("Gold");

    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c1);
  }
}
