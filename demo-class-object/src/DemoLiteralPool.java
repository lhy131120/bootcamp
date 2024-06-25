public class DemoLiteralPool {
  
  // 驗證heap 
  public static void main(String[] args) {
    // Literal Pool (String)

    String s1 = "hello";
    String s2 = "hello";
    System.out.println(s1 == s2); // true

    String s3 = "hello";
    String s4 = new String("hello");
    System.out.println(s3 == s4); // false
    System.out.println(s3 == s1 && s3 == s2); // true

    s3 = s4;
    System.out.println(s3 == s4);

    String s5 = "he";
    String s6 = "llo";

    s5 = s5 + s6; // hello 背後喺用緊new method (new String)

    System.out.println("s1="+s1);
    System.out.println("s5="+s5);
    System.out.println(s5 == s1); // true or false ?

    // Immutable - 不可被散改 - 唯獨String
    String s7 = "hello";

    // Check 指住的object
    System.out.println(System.identityHashCode(s7)); //112810359
    s7 += " world!";

    // Java 背後唔suggest修改已存在object, 所以數字唔同暗示佢new左只新object俾你
    System.out.println(System.identityHashCode(s7)); //146589023

    String s8 = "hello"; //跟s1一樣
    System.out.println(System.identityHashCode(s8));

    s8 = s8.replace('e', 'a');
    System.out.println(System.identityHashCode(s8));

    String s9 = "hello";
    s9 = s9.toUpperCase();
    System.out.println(System.identityHashCode(s9));
  }
}
