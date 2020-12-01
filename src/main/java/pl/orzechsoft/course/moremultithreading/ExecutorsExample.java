package pl.orzechsoft.course.moremultithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorsExample {

  public static void main(String[] args) throws InterruptedException {
    ExecutorService executor = Executors.newFixedThreadPool(10);

    Runnable myTask = () -> {
      try {
        Thread.sleep(10000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println("Hello 1");
    };
    Runnable myTask2 = () -> System.out.println("Hello 2");
    Runnable myTask3 = () -> System.out.println("Hello 3");
    Runnable myTask4 = () -> System.out.println("Hello 4");
    Runnable myTask5 = () -> System.out.println("Hello 5");
    Runnable myTask6 = () -> System.out.println("Hello 6");

    executor.submit(myTask);
    executor.submit(myTask2);
    executor.submit(myTask3);
    executor.submit(myTask4);
    executor.submit(myTask5);
    executor.submit(myTask6);

    if (!executor.awaitTermination(2, TimeUnit.SECONDS)) {
      executor.shutdownNow();
    }
  }
}
