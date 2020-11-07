package pl.orzechsoft.course.task13;

import java.util.Scanner;
import java.util.Set;

public class Task13 {

  public static void main(String[] args) {
    CurrencyExchange currencyExchange = new CurrencyExchange(
        Set.of("CHF", "EUR", "GBP", "PLN", "USD"), new CurrencyInfoGetter());
    currencyExchange.printWelcomeMessage();
    System.out.println("Enter currency symbol that you wish to exchange:");
    Scanner scannerInputCurrency = new Scanner(System.in);
    String inputCurrency = scannerInputCurrency.nextLine().toUpperCase();
    System.out.println("Enter currency symbol which you want to exchange your money to:");
    Scanner scannerOutputCurrency = new Scanner(System.in);
    String outputCurrency = scannerOutputCurrency.nextLine().toUpperCase();

    try {
      currencyExchange
          .exchangeCurrencies(inputCurrency, outputCurrency);
    } catch (Exception e) {
      System.err.println(
          "There was an exception when trying to get current exchange rates: " + e.getMessage());
    }
  }
}
