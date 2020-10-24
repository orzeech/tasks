package pl.orzechsoft.course.task12;

public class Car {

  private int price;
  private int profit;
  private boolean sold;

  public Car(int price, int profit, boolean sold) {
    this.price = price;
    this.profit = profit;
    this.sold = sold;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getProfit() {
    return profit;
  }

  public void setProfit(int profit) {
    this.profit = profit;
  }

  public boolean isSold() {
    return sold;
  }

  public void setSold(boolean sold) {
    this.sold = sold;
  }

  // this class needs something more!
}
