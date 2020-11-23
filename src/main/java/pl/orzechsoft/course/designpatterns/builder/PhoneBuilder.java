package pl.orzechsoft.course.designpatterns.builder;

public final class PhoneBuilder {

  private String brand;
  private String model;
  private Integer memory = 8;
  private Integer storage = 128;
  private Integer screenSize = 6;
  private Integer usbVersion = 3;
  private Integer speakers = 1;

  private PhoneBuilder() {
  }

  public static PhoneBuilder aPhone() {
    return new PhoneBuilder();
  }

  public PhoneBuilder withBrand(String brand) {
    this.brand = brand;
    return this;
  }

  public PhoneBuilder withModel(String model) {
    this.model = model;
    return this;
  }

  public PhoneBuilder withMemory(Integer memory) {
    this.memory = memory;
    return this;
  }

  public PhoneBuilder withStorage(Integer storage) {
    this.storage = storage;
    return this;
  }

  public PhoneBuilder withScreenSize(Integer screenSize) {
    this.screenSize = screenSize;
    return this;
  }

  public PhoneBuilder withUsbVersion(Integer usbVersion) {
    this.usbVersion = usbVersion;
    return this;
  }

  public PhoneBuilder withSpeakers(Integer speakers) {
    this.speakers = speakers;
    return this;
  }

  public Phone build() {
    if (brand == null) {
      throw new IllegalArgumentException("Brand cannot be null");
    }
    if (model == null) {
      throw new IllegalArgumentException("Model cannot be null");
    }
    return new Phone(brand, model, memory, storage, screenSize, usbVersion, speakers);
  }
}
