package pl.orzechsoft.course.lambdas;

public class Main {

  public static void main(String[] args) {
    SomeInterface someInterface = new SomeInterfaceImpl();
    SomeInterface someInterface2 = new SomeInterface() {
      @Override
      public String someMethod(String s) {
        return s == null ? "String is null" : "String is not null";
      }
    };
    // python arg, arg2 : co ma zwracac
    // (arg, arg2) -> co ma zwracac
    SomeInterface someInterface3 = s -> "The argument you passsed is " + s;
    System.out.println(someInterface.someMethod("cokolwiek"));
    System.out.println(someInterface2.someMethod("cokolwiek"));
    System.out.println(someInterface3.someMethod("cokolwiek"));

    InterfaceWithoutArgument myFunction = () -> {
      System.out.println("Hi from inside the function!!");
      System.out.println("hi again!");
    };

    new SomeClass().method(myFunction);
  }
}
