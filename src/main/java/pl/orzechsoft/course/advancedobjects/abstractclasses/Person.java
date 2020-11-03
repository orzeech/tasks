package pl.orzechsoft.course.advancedobjects.abstractclasses;

public abstract class Person {

  boolean isMale;
  String name;

  public void greet() {
    if (isMale) {
      System.out.println("Hi man! My name is " + name);
    } else {
      System.out.println("Hello darling, they call me " + name);
    }
  }

  public abstract String getFavoriteFood();
}
