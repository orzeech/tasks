package pl.orzechsoft.course.task24;

import java.util.Objects;

public class Operation {

  private final double amount;
  private final long timestamp;
  private final String name;

  public Operation(double amount, long timestamp, String name) {
    this.amount = amount;
    this.timestamp = timestamp;
    this.name = name;
  }

  public double getAmount() {
    return amount;
  }

  public long getTimestamp() {
    return timestamp;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Operation operation = (Operation) o;
    return Double.compare(operation.amount, amount) == 0 &&
        timestamp == operation.timestamp &&
        Objects.equals(name, operation.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, timestamp, name);
  }

  @Override
  public String toString() {
    return "Operation{" +
        "amount=" + amount +
        ", timestamp=" + timestamp +
        ", name='" + name + '\'' +
        '}';
  }
}
