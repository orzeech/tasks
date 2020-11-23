package pl.orzechsoft.course.task18;

import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {
    FileDatabase<MyClass> database = new FileDatabase<>("I:/database.txt");
    database.add(new MyClass(2, "keke"));
    database.add(new MyClass(1, "dsasa"));
    database.add(new MyClass(44, "krewrew"));
    database.add(new MyClass(5, "fdfds"));

    System.out.println(database.findById(3));
    System.out.println(database.getByJsonContainsWord("keke"));
    System.out.println(database.findObjectId(new MyClass(5, "fdfds")));
  }
}
