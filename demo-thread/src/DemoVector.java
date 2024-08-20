import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class DemoVector {

  // long startTime = 0L;
  public static void main(String[] args) {
    // ArrayList vs Vector
    // ArrayList is not thread safe sample
    List<String>  strings = new  ArrayList<>();
    Runnable addStringTaskToArrayList = () -> {
      for(int i = 0; i < 1_000_000; i ++) {
        strings.add("Hello !");
      }
      System.out.println("ArrayList size: " + strings.size());
    };

    long startTime = System.currentTimeMillis();
    Thread thread1 = new Thread(addStringTaskToArrayList);
    Thread thread2 = new Thread(addStringTaskToArrayList);
    thread1.start();  // call run()
    thread2.start();  // call run()


    try {
      thread1.join();
      thread2.join();
      long afterTime = System.currentTimeMillis();
      System.out.println("ArrayList runtime = " + (afterTime - startTime) + "ms"); // 10ms - 30ms
      System.out.println("ArrayList.size() = " + strings.size());
    } catch(InterruptedException e) {

    }

    // ===================================================================


    List<String>  strings2 = new Vector<>();
    Runnable addStringTaskToVectoRunnable = () -> {
      for(int i = 0; i < 1_000_000; i ++) {
        strings2.add("Hello !");
      }
      System.out.println("Vector size: " + strings2.size());
    };

    startTime = System.currentTimeMillis();
    Thread thread3 = new Thread(addStringTaskToVectoRunnable);
    Thread thread4 = new Thread(addStringTaskToVectoRunnable);
    thread3.start();  // call run()
    thread4.start();  // call run()


    try {
      thread3.join();
      thread4.join();
      long afterTime = System.currentTimeMillis();
      System.out.println("Vector runtime =" + (afterTime - startTime) + "ms"); // 50ms - 100ms
      System.out.println("Vector.size() = " + strings2.size());
    } catch(InterruptedException e) {

    }

    // System.out.println(strings.size()); // Main program flow
    System.out.println("Program end ...");


    // Steps to resize the ArrayList / Array(add elemnt)
    // 1. create a new array(length + 1)
    // 2. copy of the origin array to new array
    // 3. Add the new element at the array
    // 4. reassign the new obj
  }
}
