package pl.orzechsoft.course.task18;

import java.util.Objects;

public class MyClass {

  private int foo;
  private String bar;

  private MyClass() {
  }

  public MyClass(int foo, String bar) {
    this.foo = foo;
    this.bar = bar;
  }

  public int getFoo() {
    return foo;
  }

  public String getBar() {
    return bar;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MyClass myClass = (MyClass) o;
    return foo == myClass.foo &&
        Objects.equals(bar, myClass.bar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(foo, bar);
  }

  @Override
  public String toString() {
    return "MyClass{" +
        "foo=" + foo +
        ", bar='" + bar + '\'' +
        '}';
  }
}
