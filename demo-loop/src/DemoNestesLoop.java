public class DemoNestesLoop {
  public static void main(String[] args) {
    // for (int i = 0; i < 4; i++) {
    //   for (int j = 0; j < 2; j++) {
    //     System.out.println("hello " + "i=" + i + ",j=" + j);
    //   }
    // }

    for (int i = 0; i < 4; i++) {
      if (i%2 == 0) continue;
      for (int j = 0; j < 2; j++) {
        if (j%2 != 0) continue;
        System.out.println("hello " + "i=" + i + ",j=" + j);
      }
    }

    String s = "Vincent Book Game Laptop";
    // Find the first index of charactor 'a'
    // 14

    for(int i=0; i<=s.length(); i++) {
      if(s.charAt(i) == 'a') {
        System.out.println(i);
        break;
      }
    }

    // HomeWork
    // 1-20 > 1,3,5,7,9,12,14,16,18,20

    for (int i = 0; i <= 20; i++){
      // if( i <= 10 && i % 2 != 0) {
      //   System.out.println(i);
      // }

      // if(i > 10 && i % 2 == 0) {
      //   System.out.println(i);
      // }
      
    }

  //  試print 
  // *
  // **
  // ***
  // ****
  // ***
  // **
  // *
  }
}
