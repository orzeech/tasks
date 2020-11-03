package pl.orzechsoft.course.advancedobjects.beverages;

public class CocaCola extends Cola {

  @Override
  protected String getBrand() {
    return "Coca-cola";
  }

  @Override
  protected int getAmountOfAcidInPercent() {
    return 99;
  }

  @Override
  public void drink() {
    System.out.println("Cola better than pepsi");
  }
}
