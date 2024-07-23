import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayList1 {
  private Integer[] integers;

  public ArrayList1() {
    this.integers = new Integer[0];
  }

  public void add(Integer i) {
    Integer[] arr = new Integer[this.integers.length + 1];
    int idx = 0;
    for(Integer x : this.integers) {
      arr[idx++] = x;
    }
    arr[idx] = i;
    this.integers = arr;
  }

  public Integer[] getIntegers() {
    return this.integers;
  }

  public int size() {
    return integers.length;
  }

  public void remove(int index) { // 2
    Integer[] arr = new Integer[this.integers.length - 1];
    int idx = 0;
    for(int x = 0; x < this.integers.length; x++){
      if(x != index) {
        arr[idx++] = integers[x];
      }
    }
    this.integers = arr;
  }

  public boolean isEmpty() {
    return this.size() == 0;
  }

  @Override
  public String toString() {
    return Arrays.toString(this.integers);
  }

  public static void main(String[] args) {
    ArrayList1 list = new ArrayList1();
    list.add(10);
    list.add(2);
    list.add(-4);

    for(Integer x: list.getIntegers()) {
      System.out.println(x);
    }

    // System.out.println(list);

    list.add(100);
    System.out.println(list);
    // System.out.println(list.size());

    list.remove(0);
    list.remove(0);
    list.remove(1);
    list.remove(2);
    System.out.println(list);
  }
}
