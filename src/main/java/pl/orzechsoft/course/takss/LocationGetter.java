package pl.orzechsoft.course.takss;

import java.io.IOException;
import java.util.Scanner;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class LocationGetter {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    String query = scanner.nextLine();

    CloseableHttpClient httpClient = HttpClients.createDefault();

    try {
      HttpGet request = new HttpGet(
          "https://www.metaweather.com/api/location/search/?query=" + query);
      CloseableHttpResponse response = httpClient.execute(request);
      try {
        HttpEntity entity = response.getEntity();
        if (entity != null) {
          // return it as a String
          String result = EntityUtils.toString(entity);
          //System.out.println(result);
          int latLongIndex = result.lastIndexOf("latt_long");
          String substring = result.substring(latLongIndex + 12, result.lastIndexOf('"'));
          System.out.println("Location of " + query + " is " + substring);
        }

      } catch (IOException e) {
        e.printStackTrace();
      } finally {
        response.close();
      }
    } finally {
      httpClient.close();
    }

  }
}
