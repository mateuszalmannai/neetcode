package linkedIn.algorithms.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static linkedIn.algorithms.strings.StringAlgorithms.*;
import static org.assertj.core.api.Assertions.assertThat;

class StringAlgorithmsTest {

  public static final String STING1 = "hello";
  public static final String STRING1REVERESED = "olleh";
  public static final String BLANK_STRING = "";
  public static final String STRING2 = "tacos";
  public static final String STRING2REVERSED = "socat";
  public static final String STRING3 = "Hi!";
  public static final String STRING3REVERSED = "!iH";

  @Test
  @DisplayName("Test reverse string from first principles")
  void testReverseStringFromFirstPrinciples() {
    Assertions.assertAll(
        () ->  assertThat(reverseStringFromFirstPrinciples(null)).isNull(),
        () ->  assertThat(reverseStringFromFirstPrinciples("")).isEqualTo(BLANK_STRING),
        () ->  assertThat(reverseStringFromFirstPrinciples(STING1)).isEqualTo(STRING1REVERESED),
        () ->  assertThat(reverseStringFromFirstPrinciples(STRING2)).isEqualTo(STRING2REVERSED),
        () ->  assertThat(reverseStringFromFirstPrinciples(STRING3)).isEqualTo(STRING3REVERSED)
    );
  }

  @Test
  @DisplayName("Test built in reverse string")
  void testBuiltInReverseString() {
    Assertions.assertAll(
        () ->  assertThat(reverseStringBuiltIn(null)).isNull(),
        () ->  assertThat(reverseStringBuiltIn("")).isEqualTo(BLANK_STRING),
        () ->  assertThat(reverseStringBuiltIn(STING1)).isEqualTo(STRING1REVERESED),
        () ->  assertThat(reverseStringBuiltIn(STRING2)).isEqualTo(STRING2REVERSED),
        () ->  assertThat(reverseStringBuiltIn(STRING3)).isEqualTo(STRING3REVERSED)
    );
  }

  @Test
  @DisplayName("Test reversing each word in a string")
  void testReversingEachWordInAString() {
    Assertions.assertAll(
        () ->  assertThat(reverseEachWord(null)).isNull(),
        () ->  assertThat(reverseEachWord("")).isEqualTo(BLANK_STRING),
        () ->  assertThat(reverseEachWord(" ")).isEqualTo(" "),
        () ->  assertThat(reverseEachWord("sally is a great worker")).isEqualTo("yllas si a taerg rekrow"),
        () ->  assertThat(reverseEachWord("racer racecar madam")).isEqualTo("recar racecar madam"),
        () ->  assertThat(reverseEachWord("what can I do today")).isEqualTo("tahw nac I od yadot")
    );
  }


}