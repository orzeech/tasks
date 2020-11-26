package pl.orzechsoft.course.multithreading;

public class MultithreadingExample {

  public static void main(String[] args) {
    System.out.println("Starting threads");

    new Thread(() -> {
      for (int i = 0; i < 50; i++) {
        System.out.println("Hello from " + Thread.currentThread().getName());
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }, "Thread-1").start();

    System.out.println("Started threads");
  }

}
