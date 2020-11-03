package pl.orzechsoft.course.tests;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

public class Lottery {

  public static void main(String[] args) {
    Map<Set<Integer>, String> map = new HashMap<>();
    System.out.println("here");
    for (int i = 0; i < 1_000_000; i++) {
      Set<Integer> set = new HashSet<>();
      for (int j = 0; j < 6; j++) {
        int rand = new Random().nextInt(50);
        while (set.contains(rand)) {
          rand = new Random().nextInt(50);
        }
        set.add(rand);
      }
      map.put(set, UUID.randomUUID().toString());
    }
    System.out.println("done generating");
    Set<Integer> set = new HashSet<>();
    for (int j = 0; j < 2; j++) {
      int rand = new Random().nextInt(50);
      while (set.contains(rand)) {
        rand = new Random().nextInt(50);
      }
      set.add(rand);
    }
    System.out.println(map.get(set));
  }

}
