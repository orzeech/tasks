package pl.orzechsoft.course.task16.engine;

public class NormalEngine implements Engine {

  @Override
  public int getMaxSpeed() {
    return 230;
  }

  @Override
  public double getAccelerationPenalty() {
    return 0.1;
  }
}
