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
     }
}
