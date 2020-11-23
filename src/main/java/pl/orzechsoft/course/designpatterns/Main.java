package pl.orzechsoft.course.designpatterns;

import pl.orzechsoft.course.designpatterns.builder.Phone;
import pl.orzechsoft.course.designpatterns.builder.PhoneBuilder;

public class Main {

  public static void main(String[] args) {
    Phone phone = new Phone("Apple", "Iphone 6", 4, 64, 5, 2, 1);
    Phone anotherPhone = PhoneBuilder.aPhone()
        .withBrand("Xiaomi")
        .withModel("Lepsze")
        .withMemory(4)
        .build();
    System.out.println();
  }
}
