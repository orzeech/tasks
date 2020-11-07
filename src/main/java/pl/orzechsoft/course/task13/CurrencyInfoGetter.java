package pl.orzechsoft.course.task13;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.HashMap;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import pl.orzechsoft.course.task13.model.CurrencyInfo;

public class CurrencyInfoGetter {

  private final ObjectMapper objectMapper = new ObjectMapper();

  public CurrencyInfo getExchangeRate(String inputCurrency, String outputCurrency)
      throws IOException {
    HttpGet request = new HttpGet("http://www.floatrates.com/daily/" + inputCurrency + ".json");
    // This is called try-with-resources, whatever is in () will get automatically closed
    try (CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = httpClient.execute(request)) {
      // handle wrong status codes or wrong responses here
      HttpEntity entity = response.getEntity();
      // We're turning the string (JSON) into a Java object using Jackson library.
      // We're telling it to read this JSON as a Map<String, CurrencyInfo>
      return objectMapper
          .readValue(entity.getContent(), new TypeReference<HashMap<String, CurrencyInfo>>() {
          }).get(outputCurrency.toLowerCase());
    }
  }
}