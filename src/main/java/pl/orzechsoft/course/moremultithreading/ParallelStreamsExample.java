package pl.orzechsoft.course.moremultithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStreamsExample {

  public static void main(String[] args) {
    List<Long> list = new ArrayList<>();
    Random random = new Random();
    for (int i = 0; i < 1_000_000_00; i++) {
      list.add(random.nextLong());
    }
    long randomLong = random.nextLong();
    long startTime = System.currentTimeMillis();
    list.parallelStream().filter(l -> l == randomLong).findAny();
    long endTime = System.currentTimeMillis();
    System.out.println("The operation took: " + (endTime - startTime) + "ms");

    startTime = System.currentTimeMillis();
    list.parallelStream().forEach(l -> {
      long k = l + 1;
    });
    endTime = System.currentTimeMillis();
    System.out.println("The operation took: " + (endTime - startTime) + "ms");

  }
}
