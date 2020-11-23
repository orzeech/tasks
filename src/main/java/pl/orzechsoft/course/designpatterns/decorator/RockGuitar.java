package pl.orzechsoft.course.designpatterns.decorator;

public class RockGuitar {

  private Guitar baseGuitar;

  public RockGuitar(Guitar guitar) {
    baseGuitar = guitar;
  }

  public Guitar getGuitar() {
    return baseGuitar;
  }

  public void playRock() {
    baseGuitar.play("rock");
  }
}
