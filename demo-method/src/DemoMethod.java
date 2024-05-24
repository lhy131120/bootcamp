public class DemoMethod {
    public static void main(String[] args) {
        // Method : put something in box and returns something to ypu
        // System.out.println("hello");

        // Call method // JS Call function
        int sum = methodName(1, 123213);
        System.out.println(sum);

        System.out.println(lastChar("Post   ".trim()));

        System.out.println(toString(new char[]{'a', 'b', 'c'}));

        System.out.println(max(new int[] {-30, -4, -5, 0, 2, -5, -293}));

        System.out.println(isElderly(66));

        System.out.println(isSubstring("hello", "lloo"));
    }


    //Create Method // JS init function
    public static int methodName(int x, int y) {

        // if your method is with return type,
        // the method content should contain a key word "return"
        return x + y; // int + int -> int; keep same type
    }

    public static char lastChar(String s) {
        return s.charAt(s.length() - 1);
    }


    // Char array output to string
    public static String toString(char[] arr) {

        // Approach 1
        // String str = "";
        // for(int i = 0; i < arr.length; i++) {
        //      str += arr[i];
        // }
        // return str;

        // Approach 2 => Java 寫好左的 Method
        return String.valueOf(arr);
    }


    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(max <= arr[i]) {
                max = arr[i];
            }
        }

        return max;
    }

    public static boolean isElderly(int age) {
        return age > 65;
    }

    public static boolean isSubstring(String str, String substr) {
        // check if substr is a subString of str

        // Approach 1
        // return str.contains(substr);

        // Approach 2

        // if it's return -1, mean is not exist
        return str.indexOf(substr) != -1;

        // for (int i = 0; i < str.length(); i++) {                 
        //     for(int j = 0; j < substr.length(); j++) {           
        //         if(str.charAt(i + j) != substr.charAt(j)) {      
        //             return true
        //         } else if()
        //     }
        // }
    }
}