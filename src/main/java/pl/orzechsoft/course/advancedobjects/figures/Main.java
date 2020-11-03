package pl.orzechsoft.course.advancedobjects.figures;

import java.util.HashSet;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    Set<Figure> set = new HashSet<>();
    for (int i = 0; i < 10; i++) {
      set.add(new Rectangle(4, 5));
    }
    System.out.println(set.size());
    

  }
}
