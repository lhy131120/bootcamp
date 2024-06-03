import java.util.Arrays;
import java.util.Collections;

public class DemoArray {
    public static void main(String[] args) {
        // When create an array, need define the length;
        // when init define the array is int type, just only store int value
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 12;
        arr[2] = -3;
        
        // arr[1] = 100; // 變值
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);

        arr[4] = 200;
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[3]);


        // 另一個定義
        Integer[] arr2 = new Integer[] {1,2,3};
        System.out.println(Arrays.toString(arr2));


        String[] arr3 = new String[] {"hello", "abc", "ijk"};
        // System.out.println(arr3[0]);
        // System.out.println(arr3[1]);
        // System.out.println(arr3[2]);

        // System.out.println(Arrays.toString(arr3));

        int[] arr5 = new int[] {9, -3, -100, -90, 66, 13};

        Arrays.sort(arr5);
        // System.out.println(arr5[arr5.length - 1]);

        int target = Integer.MAX_VALUE; // 唔好用0做min value
        for( int i = 0; i < arr5.length; i++) {
            if(arr5[i] < target) {
                target = arr5[i];
            }
        }
        // System.out.println(target);
        

        char[] charArr = new char[] {'l','e','e','r','q'};

        int count = 0;
        boolean hasR = false;
        for(int i = 0; i<charArr.length; i++) {

            if(charArr[i] == 'e') {
                count++;
            }

            if(charArr[i] == 'r') {
                hasR = true;
                break;
            }
        }

        // Q3
        String str = "";
        for(int i = charArr.length - 1; i >= 0; i--) {
            str += charArr[i];
        }
        System.out.println(str);


        // System.out.println("count the number of 'e' is " + count);
        // System.out.println("count the number of 'r' is " + hasR);


        // Q4

        char[] c1 = new char[] {'o', 'a', 'k', 'p'};
        char[] c2 = new char[] {'a', 'b', 'f', 't'};

        // 4a append all characters to a String value; result -> "oakpabft"
        // 4b result -> "obkt" even index get from c1, odd index get from c2
        String str1 = ""; //define String Value

        // 4a
        for (int i = 0; i < c1.length; i++) {
            str1 += c1[i];
        }
        for (int i = 0; i < c2.length; i++) {
            str1 += c2[i];
        }

        System.out.println("4a: " + str1);

        // 4b

        String result = "";
        char[] c3 = new char[] {'o', 'a', 'k', 'p', 'a', 'b'};
        char[] c4 = new char[] {'a', 'b', 'f', 't'};
        // obkta
        int length = c3.length > c4.length ? c3.length : c4.length;

        for(int i = 0; i<length; i++) {
            if(i % 2 == 0 && i < c3.length) {
                result += c3[i];
            } else if(i%2==1 && i<c4.length){
                result += c4[i];
            }
        }
        System.out.println(result);

        // Average
        int[] arr_5 = new int[] {4,8,3};

        int sum = 0;
        int count2 = 0;
        for(int i = 0; i < arr_5.length; i++) {
            sum += arr_5[i];
            count2++;
        }
        System.out.println(sum / count2);

        // swapping in array ====================
        int[] arr6 = new int[] {6, 10, -4 ,15};
        // {-4, 10, 6, 15}
        int temp = arr6[2]; // -4
        arr6[2] = arr6[0]; // {6, 10, 6, 15}
        arr6[0] = temp;
        System.out.println(Arrays.toString(arr6));


        // Sorting ==================
        // {-4 ,6, 10, 15}

        // Level 1:  move -4 to the tail of the array
        // 唔需要loop哂
        int t = -1;
        for(int i = 0; i<arr6.length -1; i++) {
            t = arr6[i];
            arr6[i] = arr6[i+1];
            arr6[i+1] = t;
        }

        System.out.println("Level 1 is " + Arrays.toString(arr6));

        // level 2: 
        // move the max element to tail
        //  Result: [10,6,-4,15]
        
        for(int i = 0; i < arr6.length - 1; i++){
            // 先搵最大數
            if(arr6[i] > arr6[i + 1]){
                t = arr6[i];
                arr6[i] = arr6[i+1];
                arr6[i+1] = t;
            }
        }
        System.out.println("Level 2 is " + Arrays.toString(arr6));

        // Level 3 =============================
        // sorting [-4, 6, 10, 15]
        // for loop
        // nested loop

        for(int i = 0; i <= arr6.length; i++) {   // round
            for (int j = 0; j < arr6.length - i -1; j++) {  // moving
                if(arr6[j] > arr6[j + 1]){
                    t = arr6[j];
                    arr6[j] = arr6[j+1];
                    arr6[j+1] = t;
                }
            }
        }
        System.out.println("Level 3 is " + Arrays.toString(arr6));


        // Swap  char value =====================
        String s = "hello"; //result: swap o and e => holle
        char _tmp = ' ';
        // char[] _charArr = new char[s.length()];
        // for(int i = 0; i<s.length(); i++) {
        //     _charArr[i] = s.charAt(i);
        //     _tmp = _charArr[1];
        //     _charArr[1] = _charArr[4];
        //     _charArr[4] = _tmp;
        //     s = String.valueOf(_charArr);
        // }

        char[] _charArr = s.toCharArray(); // ['h','e','l','l','o'];
        System.out.println(_charArr);
        _tmp = _charArr[1];
        _charArr[1] = _charArr[4];
        _charArr[4] = _tmp;
        s = String.valueOf(_charArr);
        System.out.println(s);
     }
}
