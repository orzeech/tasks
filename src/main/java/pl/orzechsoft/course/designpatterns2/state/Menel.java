package pl.orzechsoft.course.designpatterns2.state;

public class Menel {

  private MenelState state;
  private int howManyDrinksToday = 0;

  public Menel() {
    this.state = MenelState.SOBER;
  }

  public MenelState getState() {
    return state;
  }

  public void drink() {
    howManyDrinksToday++;
    if (state == MenelState.DRUNK) {
      // do nothing
      return;
    }
    if (state == MenelState.DRINKING && howManyDrinksToday > 5) {
      state = MenelState.DRUNK;
    } else {
      state = MenelState.DRINKING;
    }
  }

  public void saySomething() {
    switch (state) {
      case SOBER:
        System.out.println("Hello, how are you? I'm fine, thank you");
        break;
      case DRINKING:
        System.out.println("Don't disturb...");
        break;
      case DRUNK:
        System.out.println("bvkjlhfdasjhdsjkfhsafasd");
    }
  }
}
