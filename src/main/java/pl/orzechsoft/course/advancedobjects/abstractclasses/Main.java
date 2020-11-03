package pl.orzechsoft.course.advancedobjects.abstractclasses;

public class Main {

  public static void main(String[] args) {
    Person person = new Wojtek();
    person.greet();
    System.out.println(person.getFavoriteFood());

    Person person1 = new Person() {
      @Override
      public String getFavoriteFood() {
        return "I hate food";
      }
    };

    person1.greet();

    System.out.println(person1.getFavoriteFood());
  }
}
