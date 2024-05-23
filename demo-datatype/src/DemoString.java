public class DemoString {

    public static void main(String[]args) {
        String x = "hello";
        String words = " world";

        String sentence = x + words;
        // System.out.println(sentence);

        char a = 'A';
        String msg = "msg is " + a;
        // System.out.println(msg);

        // String Metbod (Tool)
        // System.out.println(msg.length());
        // 1. length()
        if(!(msg.length() >= 4 )) {
            System.out.println("googbye");
        } else {
            System.out.println("hello");
        }

        // 2. equals()
        String s1 = "hello";
        String s2 = "hello";

        if(s1.equals(s2)) {
            // System.out.println("same value");
        } else {
            // System.out.println("not same value");
        }

        // OR的條件
        // 可以有兩種方案 if-else 
        if(s1.length() >= 6 || s1.equals(s2)) {
            // System.out.println("true");
        } else {
            // System.out.println("not Good");
        }

        // AND
        // 膠方法

        // if(....) {
        //     if(....) {
        //       ...
        //     }
        // }

        // Method 3
        // chatAt(int index), for chatAt(0)
        String s3 = "Hello World";


        char tgt = 'd';
        int length = s3.length();
        // condition last char is d and length > 5
        // char last = s3.charAt(s3.length() - 1);
        // System.out.println(tgt + last);
        if(s3.charAt(length - 1) == tgt && length > 5) {
            // System.out.println("YES");
        }

        // Method4 
        // Substring(int startIndex, int endIndex)
        // System.out.println(s3.substring(3, 8));
        // System.out.println(s3.substring(0, 8));

        String x3 = "welcome";
        // condition check if three words is "wel"
        // System.out.println(x3.substring(0, 3));
        if(x3.substring(0,3).equals("wel")) {
            System.out.println("YES");
        }

        // =========================================

        //isEmpty()
        String x7 = "";
        int x8 = x7.isEmpty() == true ?  1 : 2;

        // isBlank()
        String x9 = "";
        System.out.println(x9.isBlank()); // true 
        x9 = " ";
        System.out.println(x9.isEmpty()); // false

        String s10 = "hello";
        System.out.println(s10.substring(0)); // from index 0 to end 
        System.out.println(s10.substring(0, 3)); //from index 0 to (3-1)

        s10.toUpperCase();
        s10.toLowerCase();
        s10 = s10.replace("el", "koko");
        // System.out.println(s10.replace("el", "koko"));
        System.out.println(s10);

        //startsWith()
        System.out.println(s10.startsWith("he"));
        // endsWith
        System.out.println(s10.startsWith("ko"));

        // trim() like JavaScript

        String[] strings = new String[] {"hello", "jdksj", "vincent", "HeLLo", "   Hello  "};

        int count = 0;
        for(int i = 0; i < strings.length; i++) {
            if(strings[i].trim().toUpperCase().contains("ELL")) {
                count++;
            }
        }
        System.out.println("count ELL has " + count);
    }
}