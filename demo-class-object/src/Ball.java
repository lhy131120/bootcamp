public class Ball {
  private double weight;
  private String color;
  private int number;

  // constructors - 
  // empty constructor - by default implicity in the class
  // custom empty constructor default
  public Ball() {
    this.color = "Red";
  }

  // all args constructor
  public Ball(double weight, String color) {
    this.weight = weight;
    this.color = color;
  }

  // 理膏上OK，但無用的
  // public Ball(String color, double weight) {
  //   this.weight = weight;
  //   this.color = color;
  // }

  // outside clss also can call this method - when it's public 
  public Ball(double weight, String color, int number) {
    // this.weight = weight;
    // this.color = color;
    this(weight, color); // 縮寫已定義的constructor
    this.number = number;
  }

  // getter setter

  public double getWeight() {
    return this.weight;
  }

  public String getColor() {
    return this.color;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String toString() {
    return "Ball Color is "+ this.color +", Weight is " + this.weight +"lb."; 
  }

  public static void main(String[] args) {


    Ball b1 = new Ball(); //empty construtor
    System.out.println(b1.getColor());

    Ball b2 = new Ball(7.532, "Yellow");
    System.out.println(b2.getColor());
    System.out.println(b2.getWeight());

    System.out.println(b2.toString());
  }

}
