package pl.orzechsoft.course.designpatterns.singleton;

public class MySingleton {

  private static Integer instance;

  public static Integer getInstance() {
    if (instance == null) {
      instance = 6;
    }
    return instance;
  }
}
