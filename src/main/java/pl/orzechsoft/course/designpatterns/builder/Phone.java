package pl.orzechsoft.course.designpatterns.builder;

public class Phone {

  private final String brand;
  private final String model;
  private final Integer memory;
  private final Integer storage;
  private final Integer screenSize;
  private final Integer usbVersion;
  private final Integer speakers;

  public Phone(String brand, String model, Integer memory, Integer storage,
      Integer screenSize, Integer usbVersion, Integer speakers) {
    this.brand = brand;
    this.model = model;
    this.memory = memory;
    this.storage = storage;
    this.screenSize = screenSize;
    this.usbVersion = usbVersion;
    this.speakers = speakers;
  }

  public String getBrand() {
    return brand;
  }

  public String getModel() {
    return model;
  }

  public Integer getMemory() {
    return memory;
  }

  public Integer getStorage() {
    return storage;
  }

  public Integer getScreenSize() {
    return screenSize;
  }

  public Integer getUsbVersion() {
    return usbVersion;
  }

  public Integer getSpeakers() {
    return speakers;
  }
}
