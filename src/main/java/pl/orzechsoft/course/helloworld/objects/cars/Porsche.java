package pl.orzechsoft.course.helloworld.objects.cars;

public class Porsche {

  private String name = "Porsche";
  private int maxSpeed = 300;

  public String getName() {
    return name;
  }

  public int getMaxSpeed() {
    return maxSpeed;
  }

  public void addTurbo() {
    maxSpeed += 50;
  }
}
