package pl.orzechsoft.course.designpatterns.decorator;

public class Main {

  public static void main(String[] args) {
    Guitar guitar = new Guitar(6, "Ibanez", "black");

    guitar.play("disco polo");

    RockGuitar rockGuitar = new RockGuitar(guitar);

    rockGuitar.playRock();
  }
}
