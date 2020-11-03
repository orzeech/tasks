package pl.orzechsoft.course.advancedobjects.figures;

import pl.orzechsoft.course.advancedobjects.beverages.Cola;
import pl.orzechsoft.course.advancedobjects.dogs.Dog;

public class MyWeirdClass extends Cola implements Dog, Figure {

  @Override
  protected String getBrand() {
    return "Some brand";
  }

  @Override
  public void drink() {
    System.out.println("drinking...");
  }

  @Override
  public void woof() {
    System.out.println("Woof woof!!");
  }

  @Override
  public double calculateArea() {
    return 100;
  }

  @Override
  protected int getAmountOfAcidInPercent() {
    return 10;
  }
}
