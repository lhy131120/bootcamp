import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoArrayException {
  public static void main(String[] args) {
    int [] arr = new int[5];
    arr[0] = 1;
    arr[1] = 1;
    arr[2] = 1;
    arr[3] = 1;
    arr[4] = 1;
    // arr[5] = 1;

    int idx = 0;
    if (idx >= 0 && idx < arr.length) {
      arr[idx] = 10;
    }

    try {
      arr[5] = 1;
    } catch (ArrayIndexOutOfBoundsException exception){
      // do something
    }

    System.out.println("EOP");
    String str = "hello";
    str.charAt(1); //e
    // str.charAt(str.length()); // indexOutOfBoundException

    // parseInt
    int result = Integer.parseInt("1");
    System.out.println(result); // 1

    // ========================================
    // Error of String to int
    int result2;

    try {
      result2 = Integer.parseInt("1k2");
    } catch (NumberFormatException e) {
      result2 = -1;
    }
    System.out.println(result2); // NumberFormatException

    int age = 0;
    try {
      getDescription(age);
    } catch(IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

    // =================================

    try {
      List<String> strings = new ArrayList<>();
      strings.get(0);
    } catch(IndexOutOfBoundsException e) {
      // System.out.println(new IllegalArgumentException);
    }



    List<String> string2 = new LinkedList<>();
    // string2.get(0); //IndexOutOfBoundsException

  }

  // =========================================
  public static String getDescription(int age) {
    if(age < 0 || age == 0) 
      throw new IllegalArgumentException("age should not be negative");
      // return "Error";
    if(age >= 66)
      return "Elderly";
    if(age >= 18) 
      return "Audit";
    return "Kids";
  }

  // ============================================

}
