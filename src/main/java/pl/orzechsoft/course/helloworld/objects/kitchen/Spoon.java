package pl.orzechsoft.course.helloworld.objects.kitchen;

public class Spoon {

  private boolean used = false;

  public void eat() {
    used = true;
  }

  public boolean isUsed() {
    return used;
  }
}
