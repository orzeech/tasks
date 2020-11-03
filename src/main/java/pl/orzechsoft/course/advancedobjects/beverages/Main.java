package pl.orzechsoft.course.advancedobjects.beverages;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<Beverage> allDrinks = List
        .of(new PepsiCola(), new CocaCola(), new Vodka(), new JackAndCoke(), new Vodka(),
            new CocaCola());

    List<Beverage> drinksForKids = new ArrayList<>();
    List<Beverage> drinksForAdults = new ArrayList<>();

    for (Beverage drink : allDrinks) {
      if (canEveryoneDrink(drink)) {
        drinksForKids.add(drink);
      } else {
        drinksForAdults.add(drink);
      }
    }

    System.out.println("Okay everyone. Kids are drinking: ");
    for (Beverage drinks : drinksForKids) {
      drinks.drink();
    }

    System.out.println("Adults are drinking something stronger! ");
    for (Beverage forAdult : drinksForAdults) {
      System.out.println(((Alcohol) forAdult).getVolts() + "%");
      forAdult.drink();
    }
  }

  private static boolean canEveryoneDrink(Beverage beverage) {
    return !(beverage instanceof Alcohol);
  }
}
