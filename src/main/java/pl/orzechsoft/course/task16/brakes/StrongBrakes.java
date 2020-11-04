package pl.orzechsoft.course.task16.brakes;

public class StrongBrakes implements Brakes {

  @Override
  public double getDeceleration() {
    return 5;
  }

  @Override
  public double getUses() {
    return 10;
  }
}
