package pl.orzechsoft.course.multithreading;

import java.util.List;

public class Remover implements Runnable {

  private final List<String> list;

  public Remover(List<String> list) {
    this.list = list;
  }

  @Override
  public void run() {
    for (int i = 0; i < 50; i++) {
      if (!list.isEmpty()) {
        list.remove(0);
      }
      System.out.println(list.size());
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.err.println("Thread was interrupted");
      }
    }
  }
}
