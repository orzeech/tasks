package pl.orzechsoft.course.multithreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SharedVariableExample {

  public static void main(String[] args) {
    List<String> list = Collections.synchronizedList(new ArrayList<>());
    new Thread(new Adder(list)).start();
    new Thread(new Adder(list)).start();
    new Thread(new Adder(list)).start();
    new Thread(new Remover(list)).start();
    new Thread(new Remover(list)).start();
  }
}
