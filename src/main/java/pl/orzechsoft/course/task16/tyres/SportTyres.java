package pl.orzechsoft.course.task16.tyres;

public class SportTyres implements Tyres {

  @Override
  public double getMaxTurnSpeed() {
    return 20;
  }

  @Override
  public int getMaxTurns() {
    return 10;
  }
}
