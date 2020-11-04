package pl.orzechsoft.course.task16.transmission;

public class LongTransmission implements Transmission {

  @Override
  public double getAcceleration() {
    return 3.5;
  }

  @Override
  public double getMaxSpeedPenalty() {
    return 0;
  }
}
