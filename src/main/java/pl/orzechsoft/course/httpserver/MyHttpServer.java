package pl.orzechsoft.course.httpserver;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class MyHttpServer {

  public static void main(String[] args) throws IOException {
    HttpServer server = HttpServer.create(new InetSocketAddress("localhost", 8001), 0);
    server.createContext("/", new MyHttpHandler());
    Executor threadPoolExecutor = Executors.newFixedThreadPool(10);
    server.setExecutor(threadPoolExecutor);
    server.start();
  }

  private static class MyHttpHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
      handleResponse(httpExchange);
    }

    private void handleResponse(HttpExchange httpExchange) throws IOException {
      OutputStream outputStream = httpExchange.getResponseBody();

      String message = "{\"students\":[\"Anna\",\"Marcin\",\"Karol\"]}";

      httpExchange.getResponseHeaders().add("Content-Type", "application/json");
      httpExchange.sendResponseHeaders(200, message.length());
      outputStream.write(message.getBytes());
      outputStream.flush();
      outputStream.close();
    }
  }
}
