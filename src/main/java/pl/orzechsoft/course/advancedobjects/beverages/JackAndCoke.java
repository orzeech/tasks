package pl.orzechsoft.course.advancedobjects.beverages;

public class JackAndCoke extends Cola implements Alcohol {

  @Override
  public int getVolts() {
    return 8;
  }

  @Override
  protected String getBrand() {
    return "JD";
  }

  @Override
  protected int getAmountOfAcidInPercent() {
    return 5;
  }

  @Override
  public void drink() {
    System.out.println("I like jack and coke");
  }
}
