package marksix;

import java.util.Arrays;
import java.util.Objects;

public class Ball {
  private int number;

  public Ball(int number) {
    this.number = number;
  }

  public int getNumber() {
    return this.number;
  }

  @Override
  public boolean equals(Object obj) {
    if(this == obj)
    return true;
    if(!(obj instanceof Ball)) // 唔係果個class
    return false;
    Ball ball = (Ball) obj;
    return Objects.equals(this.number, ball.getNumber());
  }


  public static void main(String[] args) {
    byte b1 = 48;

    int i1 = 48;
    byte b2 = (byte) i1; // the type of i1 is int, so we hav2 th 


    int[] arr = new int[3];
    System.out.println(Arrays.toString(arr));
    int[] arr2 = new int[3];
    System.out.println(Arrays.toString(arr2));

    System.out.println(arr.equals(arr2)); //false  // Array下，它的equals係最基本的check
    System.out.println(arr.equals(arr2)); // Array下，它的equals係最基本的check

    Object ball = new Ball(48);
    // ball.getNumber();  Polymorhism
    System.out.println(ball.getClass()); // marksix.Ball

    Class<?> clazz = ball.getClass(); // <?> 因為暫時係未知
    System.out.println(clazz);
  }

}
