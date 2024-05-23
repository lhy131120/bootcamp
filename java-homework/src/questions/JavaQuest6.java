package questions;

public class JavaQuest6 {
  /**
   * Expected output:
   * 1 1 2 3 5 8 13 21 ...
   * 0 1 2 3 4 5 6 7
   * 
   */
  // Count the target of character in a String.
  public static void main(String[] args) {
    // Code here ...
    // for loop to print first 15 numbers in Fibonacci Sequence
    int a = 1;
    int b = 1;

    for (int i = 0; i < 15; i++){
      if(i == 0 || i == 1) {
        System.out.println("1");
      } else {
        int next = a + b;
        System.out.println(next);
        a = b;
        b = next;
      }
    }
    
  }
}