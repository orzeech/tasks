package pl.orzechsoft.course.task16.tyres;

public class LongLastingTyres implements Tyres {

  @Override
  public double getMaxTurnSpeed() {
    return 10;
  }

  @Override
  public int getMaxTurns() {
    return 100;
  }
}
