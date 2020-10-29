package pl.orzechsoft.course.tests;

public class StringReverser {

  private final String s;

  public StringReverser(String s) {
    if (s == null) {
      throw new IllegalArgumentException("String cannot be null");
    }
    this.s = s;
  }

  public String getString() {
    return s;
  }

  public String getReversedString() {
    String result = "";
    for (int i = s.length() - 1; i >= 0; i--) {
      result += s.charAt(i);
    }
    return result;
  }
}
