import java.math.BigDecimal;
import java.math.RoundingMode;

public class Person {

  // Attributes
  // private String firstName;
  // private String lastName;
  // private String fullName;
  // private double weight;
  // private double height;
  // private double bmi;
  

  // // // Empty Constructor
  // // public Person() {

  // // }

  // // All Arguments Constructor

  // public Person(String firstName, String lastName, double weight, double height) {
  //   this.firstName = firstName;
  //   this.lastName = lastName;
  //   this.weight = weight;
  //   this.height = height;
  // }

  // // Instance Method
  // public double bmi() {
  //   return BigDecimal.valueOf(this.weight)
  //     .divide(BigDecimal.valueOf(Math.pow(this.height, 2)), RoundingMode.HALF_UP)
  //     .doubleValue();
  // }

  // // public static double bmi(double w, double h) {
  // //   return 
  // // }

  // // Covert bmi() 

  // public double getWeight() {
  //   return this.weight;
  // }

  // public double getHeight() {
  //   return this.height;
  // }

  // public void setWeight(double w) {
  //   this.weight = w;
  // }

  // public void setHeight(double h) {
  //   this.height = h;
  // }

  // public String getFristName() {
  //   return this.firstName;
  // }

  // public String getLastName() {
  //   return this.lastName;
  // }

  // public void setFristName(String fristName) {
  //   this.firstName = fristName;
  // }

  // public void setLastName(String lastName) {
  //   this.lastName = lastName;
  // }

  // public String getFullName() {
  //   return "full name: " + this.firstName + " " + this.lastName;
  // }

  // public String toString() {
  //   return "First Name is: " + this.firstName + 
  //         " Last Name is " + this.lastName + 
  //         " weight is " + this.weight +
  //         " height is " + this.height +
  //         " BMI is " + this.bmi; 
  // }

  // public static void main(String[] args) {
  //   // create an Object newstaff by Class Person
  //   Person newstaff = new Person("ray", "lam", 73.3, 1.67);
  //   // newstaff.setFristName("lam");
  //   // newstaff.setLastName("ray");
  //   // newstaff.setWeight(83.3);
  //   // newstaff.setHeight(1.67);
  //   // newstaff.bmi();
  //   // newstaff.toString();
  //   // System.out.println(newstaff.toString());

  //   System.out.println(newstaff.bmi());


  //   Person p2 = new Person("tom", "Kwan", 83, 1.67);
  //   System.out.println(p2.bmi());

  //   Person p3 = p2;
  //   System.out.println(p2.getFullName()); // tom kwan
  //   System.out.println(p3.getFullName()); // tom kwan
  // }
}
