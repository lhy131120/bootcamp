package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListDemo {
  public static void main(String[] args) {
    // Array & ArratList => underlying structure of ArrayList is array
    // Array - Fixed Length, stored same type 

    // ArrayList 
    Cat cat = new Cat(Color.BLUE);
    // Heap 
    // 1. Cat Object
    // 2. Eye Array Object
    // 3. Two Eye objects
    // 4. 3 color objects (created when click "run" the main method)

    cat.getEyes(); // cat object => get Eye ArrayObject

    cat.getLeftEye(); // cat object => Eye Array Object => Eye Object
    Eye[] eyes = cat.getEyes();
    Eye rightEye = eyes[1];

    // relationship between 
    // LeftEye vs RightEye
    // Cat object vs Eye object

    String[] strings = new String[5];


    // List<String> strings = new ArrayList<>(); 
    LinkedList<String> strings2 = new LinkedList<>();
    strings2.add("A");
    strings2.add("B");
    strings2.add("C");
    strings2.remove("B");
    strings2.remove(0);
    strings2.add("D");

    for(String s : strings2) {
      System.out.println(s);
    }

    System.out.println(strings2.isEmpty());


    // LinkedList vs ArrayList
    // Method Difference (i.e. LinkedList addFirst(), removeFirst() )
    LinkedList<String> ll = new LinkedList<>();
    ll.add("hello");
    ll.addFirst("abc");
    ll.add("def");

    for(String s : ll) {
      System.out.println(s);
    }

    ll.removeFirst();
    System.out.println(ll);

    System.out.println(ll.indexOf("abc")); // -1 , not exist

    ll.add("hello");
    System.out.println(ll.lastIndexOf("hello"));

    // Queue.class
    Queue<String> emails = new LinkedList<>();
    emails.add("john@gmail.com");
    emails.add("peter@gmail.com");
    System.out.println(emails.size());

    String head = emails.poll(); // remove the first element in queue
    System.out.println(head);
    emails.add("dicky@gmail.com");
    emails.add("sally@gmail.com");

    String lookup = emails.peek(); // return the first element in queue
    System.out.println(lookup);

    // remove
    emails.remove(new String ("dicky@gamil.com")); // 有無new都唔緊要，因為同String的作者的equals係一樣

    System.out.println(emails);
    emails.remove(); // 

    // for each
    for(String s : emails) {
      System.out.println(s);
    }

    List<String> strings4 = new ArrayList<>();

    // 通常係用while loop， 
    while(!emails.isEmpty()) {
      // Convert Queue<String> to List<String>
      System.out.println(emails.poll());
      strings4.add(emails.poll());
    }

    // System.out.println(strings4);
    System.out.println(emails);

    // clear
    strings4.clear(); // clear all objects inside the ArrayList
    strings4 = null; // remove the object
    strings4.add("HI"); // is run time error sample; NPE (null pointer exception)
  }
}
