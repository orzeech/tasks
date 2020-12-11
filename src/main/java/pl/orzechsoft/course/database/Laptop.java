package pl.orzechsoft.course.database;

public class Laptop {

  private int id;
  private String make;
  private String model;
  private int cores;
  private double drive;
  private int ram;

  public Laptop(int id, String make, String model, int cores, double drive, int ram) {
    this.id = id;
    this.make = make;
    this.model = model;
    this.cores = cores;
    this.drive = drive;
    this.ram = ram;
  }

  public int getId() {
    return id;
  }

  public String getMake() {
    return make;
  }

  public String getModel() {
    return model;
  }

  public int getCores() {
    return cores;
  }

  public double getDrive() {
    return drive;
  }

  public int getRam() {
    return ram;
  }
}
