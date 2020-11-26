package pl.orzechsoft.course.multithreading;

import java.util.List;

public class Adder implements Runnable {

  private final List<String> list;

  public Adder(List<String> list) {
    this.list = list;
  }

  @Override
  public void run() {
    for (int i = 0; i < 50; i++) {
      list.add(String.valueOf(i));
      System.out.println(list.size());
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.err.println("Thread was interrupted");
      }
    }
  }
}
