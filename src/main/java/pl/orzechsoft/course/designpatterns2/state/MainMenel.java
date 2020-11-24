package pl.orzechsoft.course.designpatterns2.state;

public class MainMenel {

  public static void main(String[] args) {
    Menel menel = new Menel();
    Menel menel2 = new Menel();
    for (int i = 0; i < 13; i++) {
      System.out.print("M1 :");
      menel.saySomething();
      System.out.print("M2 :");
      menel2.saySomething();
      if (i % 2 == 0) {
        menel2.drink();
      }
      menel.drink();
    }
  }

}
