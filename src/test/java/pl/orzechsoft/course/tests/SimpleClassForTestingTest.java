package pl.orzechsoft.course.tests;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SimpleClassForTestingTest {

  @Test
  void testBasicArray() {
    // given
    int size = 5;
    int initialNumber = 2000;
    // when
    int[] array = new SimpleClassForTesting().getArray(size, initialNumber);
    // then
    int[] expected = new int[]{2000, 1000, 500, 250, 125};

    assertArrayEquals(expected, array);
  }

  @Test
  @DisplayName("Should throw an exception when passed negative argument")
  void shouldThrowExceptionWhenPassedNegativeArgument() {
    int size = -5;
    int initialNumber = 100;

    assertThrows(IllegalArgumentException.class,
        () -> new SimpleClassForTesting().getArray(size, initialNumber));
  }

  @Test
  void shouldWorkCorrectlyForSizeZero() {
    int size = 0;
    int initialNumber = 100;

    int[] array = new SimpleClassForTesting().getArray(size, initialNumber);

    assertTrue(array.length == 0);
    assertEquals(0, array.length);
  }

  @Test
  void shouldRoundTheNumbersDown() {
    int size = 2;
    int initialNumber = 25;

    int[] array = new SimpleClassForTesting().getArray(size, initialNumber);

    assertEquals(size, array.length);
    assertEquals(12, array[size - 1]);
  }
}