package pl.orzechsoft.course.task16.transmission;

public class NormalTransmission implements Transmission {

  @Override
  public double getAcceleration() {
    return 4;
  }

  @Override
  public double getMaxSpeedPenalty() {
    return 0.1;
  }
}
