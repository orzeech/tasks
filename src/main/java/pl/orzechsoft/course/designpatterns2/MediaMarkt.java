package pl.orzechsoft.course.designpatterns2;

import java.util.LinkedList;
import java.util.List;

public class MediaMarkt {

  List<Client> subscribedClients = new LinkedList<>();
  private boolean isPS5Available = false;

  public void subscribeForWhenPS5Available(Client client) {
    subscribedClients.add(client);
  }

  public boolean isPS5Available() {
    return isPS5Available;
  }

  public void makePS5Available() {
    isPS5Available = true;
    for (Client subscribedClient : subscribedClients) {
      subscribedClient.notifyOfPS5Availability();
    }
  }
}
