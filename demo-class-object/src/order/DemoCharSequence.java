package order;

public class DemoCharSequence {
  public static void main(String[] args) {
    String s = "abc";
    System.out.println(s.length()); // 3
    System.out.println(s.replace("c", "a"));


    CharSequence cs = "abc";
    System.out.println(cs.length()); // 3 
    // (Polymorphism)
    // copmile-time determine the scope of object can be accessed by "cs"
    System.out.println(cs.charAt(1)); // b
    // cs.replace()
    // error, replace() is not include on CharSequence Interface


    // String s2 = cs; // compiler concerns the type of "cs" ONLY
    String s2 = (String) cs; // Fix 
    // compile time cannot realize the actual object reference by "cs"
    // during compile-time, we don't guarantee if the casting will be successful
    // System.out.println(s2);

    if (cs instanceof String ){
      s2 = (String) cs;
    }

    System.out.println(s2.replace("b", "a"));
    StringBuilder sb = new StringBuilder("hello");
    System.out.println(sb.length()); // 5
    System.out.println(sb.charAt(1)); // e

    CharSequence ch3 = new StringBuilder("hello");
    System.out.println(sb.length()); // 5
    System.out.println(sb.charAt(1)); // e

    StringBuilder sb2 = (StringBuilder) cs; // run-time error,
    // cs refer to String object

    // 總結，正
  }
}
