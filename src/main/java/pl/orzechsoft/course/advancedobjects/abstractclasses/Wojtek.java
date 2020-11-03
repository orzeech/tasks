package pl.orzechsoft.course.advancedobjects.abstractclasses;

public class Wojtek extends Person {

  public Wojtek() {
    this.isMale = true;
    this.name = "Wojtek";
  }

  @Override
  public String getFavoriteFood() {
    return "Bułka z serem";
  }
}
