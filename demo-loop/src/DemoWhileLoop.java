public class DemoWhileLoop {
  public static void main(String[] args) {
    int i = 0; //while loop init on loop outside
    while (i < 5) {
      System.out.println(i);
      i++;
    }


    int[] arr = new int[] {10, -100, 9, 7};
    int sum = 0;
    i = 0; // init the i value
    while (i < arr.length) {
      sum += arr[i];
      i++;
    }
    System.out.println(sum);


    i = 0;
    while(i < 100) {
      if(i > 30) {
        break;
      }
      i++;
    }
    System.out.println("i="+ i);


    // 123 > 1+2+3 =6
    // 101 > 1+0+0 = 1
    // 4563 > 4+5+6+3 =18

    int num = 123;
    sum = 0;
    while(num > 0) {
      sum += num % 10; // 3
      num = num / 10; // 123 > 12
      // int / int = int
    }
    System.out.println(sum);
  }

  // Reverse number
  // 54321 > 12345
  // 101 > 101

  
}
