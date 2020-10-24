package pl.orzechsoft.course.task12;

public class Task12 {

  public static void main(String[] args) {
    // Simulation 1
    int profit1 = new CarDealership(40, 50000, 140000, 100, 30000, 141000, 4).simulateProfit();
    // Simulation 2
    int profit2 = new CarDealership(40, 50000, 140000, 100, 20000, 100000, 8).simulateProfit();
    System.out.println("It turns out that when the economy is good, my profit is " + profit1
        + " but during bad economy the profit falls to " + profit2);
  }
}
