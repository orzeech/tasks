package org.example.myproject.helloworld;

public class HelloWorld {

  public static void main(String[] args) {
    String name = "Ala";
    int len = name.length();
    boolean canWriteNameOnMargin = len <= 4;

    if (canWriteNameOnMargin) {
      System.out.println("I can write your name on my small margin");
    } else {
      System.out.println("Sorry, your name is too long");
    }
  }
}