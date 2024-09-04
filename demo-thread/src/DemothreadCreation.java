public class DemothreadCreation {
    public static void main(String[] args) {
        // Single Thread
        int x = 1; 
        x++;
        ++x; 

        Task task1 = new Task();
        Task2 task2 = new Task2();
        Thread thread1 = new Thread(task1); // main thread, thread 1
        Thread thread2 = new Thread(task2);
        thread1.start(); // run()
        thread2.start();

        // main thread would proceed without waiting for thread1
        // can use join(), then both main thread and thread1 will wait each other
        try {
            thread2.join(); 
            thread1.join(); // make sure thread will "come back" only
        } catch (InterruptedException e) {

        }


        System.out.println("Program end!!!");

        AddStringMillionTimeThread thread3 = new AddStringMillionTimeThread();
        thread3.start();

        try {
            thread3.join();
        } catch (Exception e) {
            // TODO: handle exception
        }

        
    }
}
