package pl.orzechsoft.course.task16.brakes;

public class WeakBrakes implements Brakes {

  @Override
  public double getDeceleration() {
    return 2.5;
  }

  @Override
  public double getUses() {
    return 40;
  }
}
