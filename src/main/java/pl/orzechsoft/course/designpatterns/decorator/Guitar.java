package pl.orzechsoft.course.designpatterns.decorator;

public class Guitar {

  private int strings;
  private String model;
  private String color;

  public Guitar(int strings, String model, String color) {
    this.strings = strings;
    this.model = model;
    this.color = color;
  }

  public int getStrings() {
    return strings;
  }

  public String getModel() {
    return model;
  }

  public String getColor() {
    return color;
  }

  public void play(String genre) {
    System.out.println("Playing " + genre + " music");
  }
}
