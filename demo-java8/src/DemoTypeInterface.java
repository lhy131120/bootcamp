import java.util.Arrays;
import java.util.List;

public class DemoTypeInterface {
  public static void main(String[] args) {
    // int x = 3;

    int x;
    x = 3;

    var y = 3; // compile time -> int y = 3
    y = 4;
    var z = "hello";
    var k = new Customer("John");


    List<Customer> customers = Arrays.asList(new Customer("Ben", 11));

    for(var customer: customers){

    }
  }


  // ========== Not support var for attribute ===========

  // public static class Example {
  //   var x
  // }

  // ======================================Not Support
  // public static int sum(var x, var y) {

  // }

  // public static var sum(int x, int y){
  //   return x + y;
  // }
}
