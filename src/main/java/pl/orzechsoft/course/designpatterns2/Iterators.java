package pl.orzechsoft.course.designpatterns2;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Iterators {

  public static void main(String[] args) {
    Set<String> set = Set.of("Ala", "ma", "kota", "i", "psa");
    List<String> ala = List.of("Ala", "ma", "kota", "i", "psa");
    Set<String> linkedSet = new LinkedHashSet<>(ala);

    Iterator<String> it = linkedSet.iterator();
    printEverything(it);
  }

  private static void printEverything(Iterator<String> it) {
    int i = 0;
    while (it.hasNext()) {
      System.out.println(i++ + ": " + it.next());
    }
  }

}
