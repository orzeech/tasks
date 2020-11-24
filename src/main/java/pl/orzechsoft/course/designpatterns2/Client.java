package pl.orzechsoft.course.designpatterns2;

public class Client {

  private final String name;

  public Client(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void notifyOfPS5Availability() {
    System.out.println("HOORAY I CAN BUY NOW MY NAME IS " + name);
  }
}
