package pl.orzechsoft.course.task13.model;

public class CurrencyInfo {

  private String code;
  private String alphaCode;
  private String numericCode;
  private String name;
  private double rate;
  // Don't bother with parsing date for now
  private String date;
  private double inverseRate;

  // When you're serializing from JSON, this is necessary
  private CurrencyInfo() {
  }

  // We're making our class immutable, that is, once you create it, it cannot be changed
  public CurrencyInfo(String code, String alphaCode, String numericCode, String name, double rate,
      String date, double inverseRate) {
    this.code = code;
    this.alphaCode = alphaCode;
    this.numericCode = numericCode;
    this.name = name;
    this.rate = rate;
    this.date = date;
    this.inverseRate = inverseRate;
  }

  public String getCode() {
    return code;
  }

  public String getAlphaCode() {
    return alphaCode;
  }

  public String getNumericCode() {
    return numericCode;
  }

  public String getName() {
    return name;
  }

  public double getRate() {
    return rate;
  }

  public String getDate() {
    return date;
  }

  public double getInverseRate() {
    return inverseRate;
  }
}
