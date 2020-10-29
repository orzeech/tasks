package pl.orzechsoft.course.setsandmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SetsAndMaps {

  public static void main(String[] args) {
    setAndListComparison();
    maps();
  }

  private static void maps() {
    Map<String, String> zipCodes = new HashMap<>();
    zipCodes.put("Wojtek", "31-005");
    zipCodes.put("Tomek", "25-002");
    zipCodes.put("Monika", "00-023");

    System.out.println(zipCodes.containsKey("Marian"));
    String marianna = zipCodes.get("Marianna");
    System.out.println(marianna);

    Set<String> set = zipCodes.keySet();

    for (String s : set) {
      System.out.println("Name is " + s);
    }

    String search = "Tomek";
    System.out.println("Which code does " + search + " live under? " + zipCodes.get(search));

    Map<Integer, Whatever> whateverMap = new HashMap<>();
    whateverMap.put(123, new Whatever("sssda", 3245, List.of("cokolwiek")));
  }

  private static void setAndListComparison() {
    List<Integer> list = new ArrayList<>();

    int howManyIntegers = 20000000;
    for (int i = 0; i < howManyIntegers; i++) {
      list.add(i);
    }

    Set<Integer> set = new HashSet<>();

    for (int i = 0; i < howManyIntegers; i++) {
      set.add(i);
    }
    Integer search = 19999999;
    // początek "epoki" 01.01.1970
    long startTime = System.currentTimeMillis();
    System.out.println("List contains " + search + "? " + list.contains(search));
    long endTime = System.currentTimeMillis();
    System.out.println("Operation took " + (endTime - startTime) + " ms");
    startTime = System.currentTimeMillis();
    System.out.println("Set contains " + search + "? " + set.contains(search));
    endTime = System.currentTimeMillis();
    System.out.println("Operation took " + (endTime - startTime) + " ms");
  }

}
