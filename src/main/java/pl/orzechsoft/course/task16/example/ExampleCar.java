package pl.orzechsoft.course.task16.example;

import java.util.Comparator;
import java.util.List;
import pl.orzechsoft.course.task16.RaceCar;
import pl.orzechsoft.course.task16.brakes.MediumBrakes;
import pl.orzechsoft.course.task16.brakes.StrongBrakes;
import pl.orzechsoft.course.task16.brakes.WeakBrakes;
import pl.orzechsoft.course.task16.engine.HugeEngine;
import pl.orzechsoft.course.task16.engine.NormalEngine;
import pl.orzechsoft.course.task16.transmission.NormalTransmission;
import pl.orzechsoft.course.task16.transmission.ShortTransmission;
import pl.orzechsoft.course.task16.tyres.NormalTyres;
import pl.orzechsoft.course.task16.tyres.SportTyres;

public class ExampleCar extends RaceCar {

  @Override
  protected void prepareForRace(List<Integer> track) {
    if (track.size() < 6) {
      tyres = new SportTyres();
    } else {
      tyres = new NormalTyres();
    }
    int maxStraight = track.stream().max(Comparator.comparingInt(Integer::intValue)).get();
    if (maxStraight < 500) {
      engine = new NormalEngine();
      transmission = new NormalTransmission();
    } else {
      engine = new HugeEngine();
      transmission = new ShortTransmission();
    }
    if (track.size() <= 10) {
      brakes = new StrongBrakes();
    } else if (track.size() <= 20) {
      brakes = new MediumBrakes();
    } else {
      brakes = new WeakBrakes();
    }
  }

  @Override
  protected String getName() {
    return "Testowa maszyna";
  }
}
