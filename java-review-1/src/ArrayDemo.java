public class ArrayDemo {
  public static void main(String[] args) {
    int [] arr = new int[] {1,2,3}; // right hand slide is array object
    // left hand slide: arr is an object reference

    // Integer [] integers = new int[] {1,2,3};

    Integer[] integers = new Integer[] {1,2,3}; // upcast, 1 (int value) => Integer Object with value 1
    // here is four onject 
    // 1. Array Object
    // 2. Integer Object with value 1
    // 3. Integer Object with value 2
    // 4. Integer Object with value 3

    System.out.println(integers[2]); // 3 integers[2] => storing the address of Integer Object with value 3
  }
}
