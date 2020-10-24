package pl.orzechsoft.course.task12;

import java.util.ArrayList;
import java.util.List;

public class CarDealership {

  private final int capacity;
  private final int carPriceMin;
  private final int carPriceMax;
  private final int maxClientsPerMonth;
  private final int clientBudgetMin;
  private final int clientBudgetMax;
  private final int depreciation;
  private List<Car> cars;

  public CarDealership(int capacity, int carPriceMin, int carPriceMax, int maxClientsPerMonth,
      int clientBudgetMin, int clientBudgetMax, int depreciation) {
    this.capacity = capacity;
    this.carPriceMin = carPriceMin;
    this.carPriceMax = carPriceMax;
    this.maxClientsPerMonth = maxClientsPerMonth;
    this.clientBudgetMin = clientBudgetMin;
    this.clientBudgetMax = clientBudgetMax;
    this.depreciation = depreciation;
    this.cars = new ArrayList<>();
  }

  public int simulateProfit() {
    // implement this
    return 0;
  }

  // SUGGESTED METHODS, but you can implement it however you like
  // private Client generateRandomClient()
  // private void takeCarsFromCentral()
  // private List<Car> getUnsoldCars()
  // private void deprecateValue(Car car)

}
