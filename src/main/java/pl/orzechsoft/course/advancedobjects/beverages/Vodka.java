package pl.orzechsoft.course.advancedobjects.beverages;

public class Vodka implements Alcohol {

  @Override
  public int getVolts() {
    return 40;
  }

  @Override
  public void drink() {
    System.out.println("I hate vodka");
  }
}
