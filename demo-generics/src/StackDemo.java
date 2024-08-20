import java.util.List;
import java.util.Stack;

public class StackDemo {
  public static void main(String[] args) {
    // Last-in, First out

    Stack<String> ss = new Stack<>();
    ss.add("hello");
    ss.add("world");
    ss.add("abc");

    System.out.println(ss.pop()); // abc, remove and return the last element
    ss.push("bbb");
    System.out.println(ss);

    List<String> ss2 = new Stack<>();
    // ss2.push("sdsd");
    // ss2.pop("dsadsad");

    ss2.add("dsada");
    ss2.remove("dsada");
    System.out.println(ss2);
  }
}
