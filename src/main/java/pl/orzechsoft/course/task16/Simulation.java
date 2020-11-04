package pl.orzechsoft.course.task16;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import pl.orzechsoft.course.task16.example.ExampleCar;

public class Simulation {

  public static void main(String[] args) {

    List<Integer> track = List.of(200, 1000, 100, 400, 300, 200, 50, 50, 50, 3000);

    RaceCar car = new ExampleCar();
    car.prepareForRace(track);

    List<RaceCar> cars = List.of(car);

    List<RaceCar> winners = simulate(cars, track);

    System.out.println("We have our winners!");
    System.out.println(winners.stream().map(RaceCar::getName).collect(Collectors.joining(", ")));
  }

  private static List<RaceCar> simulate(List<RaceCar> cars, List<Integer> track) {
    Map<RaceCar, Integer> results = new HashMap<>();
    for (RaceCar car : cars) {
      double currentSpeed = 0;
      int secondsElapsed = 0;
      for (int straightPart : track) {
        System.out.println("Started " + straightPart + "m long part");
        double currentPartDone = 0;
        while (currentPartDone < straightPart) {
          if (car.getTyres().getMaxTurnSpeed() > car.getBrakes().getDeceleration() * currentSpeed) {
            currentSpeed = Math.min(
                car.getEngine().getMaxSpeed() * (1 - car.getTransmission().getMaxSpeedPenalty()),
                currentSpeed + car.getTransmission().getAcceleration() * car.getEngine()
                    .getAccelerationPenalty());
          } else {
            currentSpeed -= Math.max(0,
                car.getBrakes().getDeceleration() * car.getEngine().getAccelerationPenalty());
          }
          currentPartDone += currentSpeed;
          secondsElapsed++;
        }
      }
      results.put(car, secondsElapsed);
      System.out
          .println("Car " + car.getName() + " has beaten the track in " + secondsElapsed + "s");
    }

    return results.entrySet().stream().sorted(Comparator.comparingInt(Entry::getValue))
        .map(Entry::getKey).collect(
            Collectors.toList());
  }

}
