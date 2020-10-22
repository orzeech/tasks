package pl.orzechsoft.course.helloworld.objects.kitchen;

import static pl.orzechsoft.course.helloworld.objects.kitchen.Constants.BOILING_TEMPERATURE;
import static pl.orzechsoft.course.helloworld.objects.kitchen.Constants.ROOM_TEMPERATURE;

public class Pot {

  private String name = "Default name";
  private int howMuchWaterInMl;
  private int temperature;

  public Pot() {
    this.howMuchWaterInMl = 0;
    this.temperature = ROOM_TEMPERATURE;
  }

  public void addWater(int howMuch) {
    howMuchWaterInMl += howMuch;
  }

  public void heatUp(int byHowManyDegrees) {
    temperature += byHowManyDegrees;
  }

  public boolean isBoiling() {
    return temperature >= BOILING_TEMPERATURE;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHowMuchWaterInMl() {
    return howMuchWaterInMl;
  }

  public int getTemperature() {
    return temperature;
  }
}
