package pl.orzechsoft.course.designpatterns2;

public class ObserverPatternMain {

  public static void main(String[] args) {
    MediaMarkt mediaMarkt = new MediaMarkt();

    for (int i = 0; i < 10; i++) {
      System.out.println(mediaMarkt.isPS5Available());
    }

    Client clientA = new Client("A");
    Client clientB = new Client("B");

    mediaMarkt.subscribeForWhenPS5Available(clientA);
    mediaMarkt.subscribeForWhenPS5Available(clientB);
    
    mediaMarkt.makePS5Available();

    for (int i = 0; i < 10; i++) {
      System.out.println(mediaMarkt.isPS5Available());
    }

  }

}
