package pl.orzechsoft.course.moremultithreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CountdownLatchExample {

  public static void main(String[] args) throws InterruptedException {
    CountDownLatch countDownLatch = new CountDownLatch(5);
    List<String> output = Collections.synchronizedList(new ArrayList<>());

    Thread t1 = new Thread(new Worker(output, countDownLatch));
    Thread t2 = new Thread(new Worker(output, countDownLatch));
    Thread t3 = new Thread(new Worker(output, countDownLatch));
    Thread t4 = new Thread(new Worker(output, countDownLatch));
    Thread t5 = new Thread(new Worker(output, countDownLatch));

    t1.start();
    t2.start();
    t3.start();
    t4.start();
//    t5.start();

    countDownLatch.await(5, TimeUnit.SECONDS);

    output.add("Latch released now");
    output.forEach(System.out::println);
  }
}
