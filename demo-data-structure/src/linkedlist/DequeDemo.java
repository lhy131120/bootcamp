package linkedlist;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DequeDemo {
  public static void main(String[] args) {
    Deque<String> strings = new LinkedList<>();
    strings.add("abc");
    strings.add("def");
    // System.out.println(strings);
    strings.addFirst("hello");
    strings.addLast("World");
    // System.out.println(strings);

    // strings.peek();
    // System.out.println(strings);
    // strings.peekFirst();
    // strings.peekLast();

    // System.out.println(strings);
    // strings.remove();
    // System.out.println(strings);
    // strings.removeFirst();
    // System.out.println(strings);
    // strings.removeLast();
    // System.out.println(strings);

    // ArrayDeque.class 
    Deque<String> string2 = new ArrayDeque<>(); // underlying Data Structure => array => fixed length
    string2.add("abc");
    string2.add("def");
    string2.addFirst("xyz");
    string2.addLast("xyz");
    System.out.println(string2);

    Queue<String> strings3 = new ArrayDeque<>(); // Coding Prsentation
    strings3.add("apple");
    strings3.add("banner");
    strings3.remove();
    System.out.println(strings3);


    List<String> strings5 = new ArrayList<>();  // compiler time 先至知
    strings.add("abc");
    strings.add("xyz");
    strings5.add(0, "apple"); // insert
    System.out.println(strings5);

  }
}
