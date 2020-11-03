package pl.orzechsoft.course.advancedobjects.beverages;

public class PepsiCola extends Cola {

  @Override
  protected String getBrand() {
    return "Pepsi";
  }

  @Override
  protected int getAmountOfAcidInPercent() {
    return 10;
  }

  @Override
  public void drink() {
    System.out.println("Pepsi better than cola");
  }
}
