package pl.orzechsoft.course.multithreading;

public class MyCounter {

  private int count = 0;

  public synchronized void add(int value) {
    count += value;
  }

  public synchronized void subtract(int value) {
    count -= value;
  }

  public int getCount() {
    return count;
  }
}
