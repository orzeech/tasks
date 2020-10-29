package pl.orzechsoft.course.tests;

public class SimpleClassForTesting {

  protected int[] getArray(int size, int initialNumber) {
    if (size < 0) {
      throw new IllegalArgumentException("Size cannot be negative");
    }
    int[] array = new int[size];
    if (size == 0) {
      return array;
    }
    array[0] = initialNumber;
    for (int i = 1; i < size; i++) {
      array[i] = array[i - 1] / 2;
    }
    return array;
  }
}
