package pl.orzechsoft.course.multithreading;

public class SynchronizedExample {

  public static void main(String[] args) throws InterruptedException {
    MyCounter counter = new MyCounter();
    Thread thread1 = new Thread(() -> {
      for (int i = 0; i < 10; i++) {
        counter.add(i);
      }
    }, "Adder");

    Thread thread2 = new Thread(() -> {
      for (int i = 0; i < 10; i++) {
        counter.add(5);
      }
    }, "Adder2");

    thread1.start();
    thread2.start();

    Thread.sleep(1000);
    System.out.println(counter.getCount());
  }
}
