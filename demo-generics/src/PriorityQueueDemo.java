

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import sorting.Ball;

public class PriorityQueueDemo {
  public static void main(String[] args) {
    Queue<String> pq = new PriorityQueue<>();
    pq.add("def"); // sort => [def]
    pq.add("abc"); // sort [def, abc] => [abc, def]
    pq.add("bbb"); // sort [abc, def, bbb] => [abc, bbb, def]
    // System.out.println(pq); // [abc, def, bbb], so add() method doesn't not perform sorting...


    // while 
    while (!pq.isEmpty()) {
      System.out.println(pq.poll());// complete sorting when call poll() method
    }

    List<String> pq2 = new LinkedList<>();
    pq2.add("def");
    pq2.add("abc");
    pq2.add("bbb");
    pq2.add("daa");

    System.out.println(pq2);
    System.out.println(pq2);
    Collections.sort(pq2);
    System.out.println(pq2);

    // Java
    Queue<Integer> pq3 = new PriorityQueue<>();
    pq3.add(-23);
    pq3.add(100);
    pq3.add(23);
    pq3.add(-200);
    System.out.println(pq3.poll());
    pq3.add(-400);
    System.out.println(pq3.poll());
    System.out.println(pq3.poll());
    System.out.println(pq3.poll());
    System.out.println(pq3.poll());

    // Queue<Short> pq4 = new PriorityQueue<>();
    // add
    // pq4.add(235);

    Queue<Customer> pq5 = new PriorityQueue<>(CustomerSortByAge.of());
    pq5.add(new Customer(20));
    pq5.add(new Customer(10));
    pq5.add(new Customer(40));
    pq5.add(new Customer(30));
    System.out.println(pq5.poll()); // 40
    System.out.println(pq5.poll()); // 30
    System.out.println(pq5.poll()); // 20
    System.out.println(pq5.poll()); // 10
    
  }
}
