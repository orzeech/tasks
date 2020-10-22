package pl.orzechsoft.course.helloworld.objects;

import pl.orzechsoft.course.helloworld.objects.cars.Porsche;
import pl.orzechsoft.course.helloworld.objects.cars.Tractor;

public class RaceTrack {

  public static void main(String[] args) {
    Porsche porsche = new Porsche();
    porsche.addTurbo();

    Porsche gorszePorsche = new Porsche();

    System.out.println(
        "max speed p1 " + porsche.getMaxSpeed() + " max speed p2 " + gorszePorsche.getMaxSpeed());

    Tractor tractor = new Tractor();

    System.out.println(
        "can my tractor go as fast as p2? " + tractor.canGoThisFast(gorszePorsche.getMaxSpeed()));
  }
}
