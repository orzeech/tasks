package pl.orzechsoft.course.lambdas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Streams {

  public static void main(String[] args) {
    List<String> names = List
        .of("Marcin", "Adam", "Agata", "Anna", "Mateusz", "Wojtek", "Kasia", "Tomek", "Kamil",
            "Maria", "Arkadiusz", "Przemysław", "Horacy", "Zofia", "Genowefa", "Serafin");
    List<Integer> list = List
        .of(4532, 321312, 34, 324, 2, 341, 32, 124, 324, 345, 34, 3, 213, 12, 4324, 53, 46, 456,
            546, 2, 421, 21, 321, 321, 3);

    List<Person> persons = names.stream().map(name -> new Person(name, 15))
        .filter(person -> !person.getName().contains("e"))
        .collect(Collectors.toList());
    persons.forEach(person -> System.out
        .println(person.getName() + " will be adult in " + (18 - person.getAge()) + " years"));

    System.out.println(list.stream().mapToLong(Integer::longValue).sum());

    // Operacje konczace stream: forEach, collect
    // Operacje nie konczace streamu: filter, map
    // doSomething(names);

    names.stream().map(s -> s + " Kowalski").forEach(System.out::println);

    List<String> femaleNames = getFemaleNames(names);
    List<String> femaleNamesShorter = getFemaleNamesShorter(names);
    // lambdaOperations(names);
    System.out.println();
  }

  private static List<String> getFemaleNames(List<String> names) {
    List<String> result = new ArrayList<>();
    for (String name : names) {
      if (name.charAt(name.length() - 1) == 'a') {
        result.add(name);
      }
    }
    return result;
  }

  private static List<String> getFemaleNamesShorter(List<String> names) {
    return names.stream().filter(s -> s.charAt(s.length() - 1) == 'a').collect(Collectors.toList());
  }

  private static void lambdaOperations(List<String> names) {
    // dokladnie to samo
    Set<Integer> lengths = new HashSet<>();
    for (String name : names) {
      int length = name.length();
      if (length > 4) {
        lengths.add(length);
      }
    }

    Set<Integer> namesLengths = names.stream().map(str -> str.length()).filter(len -> len > 4)
        .collect(Collectors.toSet());
  }

  private static void doSomething(List<String> names) {
    Consumer<String> greeter = new Consumer<String>() {
      @Override
      public void accept(String s) {
        System.out.println("Hello " + s);
      }
    };
    names.stream().forEach(s -> System.out.println("Hello " + s));
    names.stream().forEach(greeter);
  }
}
