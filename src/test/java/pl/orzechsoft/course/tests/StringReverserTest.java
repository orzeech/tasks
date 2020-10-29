package pl.orzechsoft.course.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringReverserTest {

  @Test
  @DisplayName("Should get a string that was passed in a constructor")
  void shouldGetString() {
    String s = "cokolwiek";

    String actual = new StringReverser(s).getString();

    assertEquals(s, actual);
  }

  @Test
  @DisplayName("Should get reversed string")
  void shouldGetReversedString() {
    String s = "cokolwiek";
    String reversed = "keiwlokoc";

    String actual = new StringReverser(s).getReversedString();

    assertEquals(reversed, actual);
  }

  @Test
  @DisplayName("Should get reversed string for a single character")
  void shouldGetReversedStringForSingleCharacter() {
    String s = "c";
    String reversed = "c";

    String actual = new StringReverser(s).getReversedString();

    assertEquals(reversed, actual);
  }

  @Test
  @DisplayName("Should get reversed string for an empty string")
  void shouldGetReversedStringForEmptyString() {
    String s = "";
    String reversed = "";

    String actual = new StringReverser(s).getReversedString();

    assertEquals(reversed, actual);
  }

  @Test
  @DisplayName("Should throw exception when passed null")
  void shouldThrowExceptionWhenPassedNull() {
    String s = null;
    assertThrows(IllegalArgumentException.class, () -> new StringReverser(s));
  }
}