import java.util.concurrent.atomic.AtomicInteger;

public class DemoImplement {
  private int x = 0;
  private int k = 0;
  private final Object lock = new Object();
  // Solution 2 - AtomicInteger => 只係做＋＋ / - - 最好
  private AtomicInteger y = new AtomicInteger(0);

  // Solution 1 
  // instance method

  // 好處成個class封住
  public synchronized void incrment() {
    this.x++;
  }

  // 只lock需要的部分 - Solution 3
  public void incrment2() {
    this.k++;
    int x = 0;
    //  lock a code Block 
    synchronized(lock) {
      this.x++;
    }
  }

  public static void main(String[] args) {

    DemoImplement ball = new DemoImplement();

    Runnable task = () -> {
      Thread threadInfo = Thread.currentThread(); // call current thread

      // System.out.println(threadInfo.getId());
      // System.out.println(threadInfo.getName());

      for(int i = 0; i < 1_000_000; i++) {
        ball.x++; // by default. x++ support multi thread
      }
    };

    Thread thread1 = new Thread(task);
    Thread thread2 = new Thread(task);

    thread1.start();
    thread2.start();

    try {
      thread1.join();
      thread2.join();
    } catch(InterruptedException e) {

    }

    System.out.println("x=" + ball.x);

    // =======================================

    ball.x = 0;

    Runnable task2 = () -> {
      for(int i = 0; i < 1_000_000; i++) {
        ball.incrment();
      }
    };

    Thread thread3 = new Thread(task2);
    Thread thread4 = new Thread(task2);

    thread3.start();
    thread4.start();

    try {
      thread3.join();
      thread4.join();
    } catch(InterruptedException e) {

    }

    System.out.println("x=" + ball.x);


    // ========================================
    ball.x = 0;

    Runnable task3 = () -> {
      for(int i = 0; i < 1_000_000; i++) {
        ball.y.incrementAndGet(); // as like as y++
      }
    };

    Thread thread5 = new Thread(task3);
    Thread thread6 = new Thread(task3);

    thread5.start();
    thread6.start();

    try {
      thread5.join();
      thread6.join();
    } catch(InterruptedException e) {

    }

    System.out.println("y=" + ball.y.get());

    // =======================================

    ball.x = 0;

    Runnable task4 = () -> {
      for(int i = 0; i < 1_000_000; i++) {
        ball.incrment2();
      }
    };

    Thread thread7 = new Thread(task4);
    Thread thread8 = new Thread(task4);

    thread7.start();
    thread8.start();

    try {
      thread7.join();
      thread8.join();
    } catch(InterruptedException e) {

    }

    System.out.println("x=" + ball.x);
    System.out.println("k=" + ball.k);


    System.out.println("Program ends ...");
  }

}
