package pl.orzechsoft.course.advancedobjects.figures;

import java.util.Objects;

public class Rectangle implements Figure {

  private final double a;
  private final double b;

  public Rectangle(double a, double b) {
    this.a = a;
    this.b = b;
  }

  @Override
  public double calculateArea() {
    return a * b;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rectangle rectangle = (Rectangle) o;
    return Double.compare(rectangle.a, a) == 0 &&
        Double.compare(rectangle.b, b) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(a, b);
  }
}
