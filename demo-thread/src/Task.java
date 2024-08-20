class Task implements Runnable{
  // @Override

  public void run() {
    for(int i = 0; i < 3; i++) {
      System.out.println("Thread Run 1: " + i);
    }
  }
}
