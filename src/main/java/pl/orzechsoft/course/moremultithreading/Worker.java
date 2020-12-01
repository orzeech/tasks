package pl.orzechsoft.course.moremultithreading;

import java.util.List;
import java.util.concurrent.CountDownLatch;

public class Worker implements Runnable {

  private final List<String> outputScraper;
  private final CountDownLatch countDownLatch;

  public Worker(List<String> outputScraper, CountDownLatch countDownLatch) {
    this.outputScraper = outputScraper;
    this.countDownLatch = countDownLatch;
  }

  @Override
  public void run() {
    doSomeWork();
    outputScraper.add("Counted down");
    countDownLatch.countDown();
  }

  private void doSomeWork() {
    try {
      Thread.sleep(100);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
