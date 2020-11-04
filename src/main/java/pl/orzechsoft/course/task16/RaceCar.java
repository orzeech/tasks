package pl.orzechsoft.course.task16;

import java.util.List;
import pl.orzechsoft.course.task16.brakes.Brakes;
import pl.orzechsoft.course.task16.engine.Engine;
import pl.orzechsoft.course.task16.transmission.Transmission;
import pl.orzechsoft.course.task16.tyres.Tyres;

public abstract class RaceCar {

  protected Brakes brakes;
  protected Engine engine;
  protected Transmission transmission;
  protected Tyres tyres;

  public Brakes getBrakes() {
    return brakes;
  }

  public Engine getEngine() {
    return engine;
  }

  public Transmission getTransmission() {
    return transmission;
  }

  public Tyres getTyres() {
    return tyres;
  }

  protected abstract void prepareForRace(List<Integer> track);

  protected abstract String getName();
}
