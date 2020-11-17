package pl.orzechsoft.course.lambdas;

public class SomeInterfaceImpl implements SomeInterface {

  @Override
  public String someMethod(String s) {
    return s + " is " + s.length() + " characters long";
  }
}
