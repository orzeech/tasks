package pl.orzechsoft.course.advancedobjects.figures;

public class Circle implements Figure {

  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double calculateArea() {
    return Math.PI * radius * radius;
  }

  public boolean isBiggerThan(Figure f) {
    return calculateArea() > f.calculateArea();
  }
}
