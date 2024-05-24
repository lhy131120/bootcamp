package questions;
/**
 * Example Output
 * Second Max = 230
 */
public class JavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {
    int[] nums1 = new int[] { -10, 5, 100, 240, 230, 80 }; // Second Max = 230
    int[] nums2 = new int[] { -10, 5, 100, 120, 240, 200 }; // Second Max = 200
    int[] nums3 = new int[] { -10, 5, 120, -100, 100, 240 }; // Second Max = 120
    int[] nums = new int[] { -10, 5, 100, 240, 240, 80}; // Second Max = 240

    // Your program should be able to handle all the above test case.
    int secondMax;
    // code here ...

    int max = Integer.MIN_VALUE;
     secondMax = Integer.MIN_VALUE;
    for(int i = 0; i < nums.length; i++) {
      if(nums[i] > max){  // -10 > -12xxxxxxxx ?  =>  5 > -10 ? => 100 > 5 ? 240 > 100 ? 230 > 240 ?
        secondMax = max;     // 2nd: -12xxxxxx ; 2nd: -10 ; 2nd: 5 ; 2nd: 100
        max = nums[i];    // max: -10 ; max: 5 ; max: 100 ; max = 240
      } else if( (nums[i] > secondMax) ) {  //when 230 > 240? || 240 > 240 ?
        secondMax = nums[i];
      } 
    }

    System.out.println("Second Max = " + secondMax);
  }
}