import java.util.Arrays;

public class Bag {
  private int[] integers;

  // constructor
  public Bag() {

  }

  public Bag(int[] integers) {
    this.integers = integers;
  }

  // getter
  public int[] getIntegers() {
    return this.integers;
  }

  public void setIntegers(int[] integers) {
    this.integers = integers;
  }

  public String toString() {
    return "Bag integers = "+ Arrays.toString(integers) +".";
  }

  public static void main(String[] args) {
    int[] integers = new int[] {3,1,2};
    Bag b1 = new Bag(integers);
    // 有唔同
    // b1.setIntegers(new int[] {3,4,1});
    System.out.println(b1.toString());
    System.out.println(new Bag(new int[] {100, -2, 6}).toString());

    int[] x = b1.getIntegers();
    b1.setIntegers(new int[] {5, 6, 7});
  }
}
