package pl.orzechsoft.course.setsandmaps;

import java.util.List;
import java.util.Objects;

public class Whatever {

  String s;
  int a;
  List<String> list;

  public Whatever(String s, int a, List<String> list) {
    this.s = s;
    this.a = a;
    this.list = list;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Whatever whatever = (Whatever) o;
    return a == whatever.a &&
        Objects.equals(s, whatever.s) &&
        Objects.equals(list, whatever.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(s, a, list);
  }
}
