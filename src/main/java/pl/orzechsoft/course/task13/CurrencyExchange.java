package pl.orzechsoft.course.task13;


import java.io.IOException;
import java.util.Set;
import pl.orzechsoft.course.task13.model.CurrencyInfo;

public class CurrencyExchange {

  private final Set<String> availableCurrencies;
  private final CurrencyInfoGetter currencyInfoGetter;

  public CurrencyExchange(Set<String> availableCurrencies, CurrencyInfoGetter currencyInfoGetter) {
    this.availableCurrencies = availableCurrencies;
    this.currencyInfoGetter = currencyInfoGetter;
  }

  public void printWelcomeMessage() {
    System.out.println(
        "Welcome in currency exchange. We buy/sell " + String.join(", ", availableCurrencies));
  }

  // change this so it makes more sense (don't print here)
  public void exchangeCurrencies(String currencyFrom, String currencyTo) throws IOException {
    if (!availableCurrencies.contains(currencyFrom) || !availableCurrencies.contains(currencyTo)) {
      throw new IllegalArgumentException(
          "You've entered incorrect currency symbol. Available currencies are: " + String
              .join(", ", availableCurrencies));
    }
    if (currencyFrom.equals(currencyTo)) {
      throw new IllegalArgumentException("It's not possible to exchange the same currency");
    }
    CurrencyInfo currencyInfo = currencyInfoGetter.getExchangeRate(currencyFrom, currencyTo);
    // Assume 4% spread
    System.out
        .println("We'll sell 100 " + currencyTo + " for " + String
            .format("%.2f", currencyInfo.getInverseRate() * 98) + " " + currencyFrom);
    System.out.println("Just in case, we'll buy 100 " + currencyFrom + " for " + String
        .format("%.2f", currencyInfo.getRate() * 102) + " " + currencyTo);
  }
}