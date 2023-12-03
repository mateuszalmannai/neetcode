package linkedIn.algorithms.validation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static linkedIn.algorithms.validation.AllOrNothingValidation.*;
import static org.assertj.core.api.Assertions.assertThat;

class AllOrNothingValidationTest {

  public static final String LOWERCASE_STRING = "hello";
  public static final String UPPERCASE_STRING = "HELLO";
  public static final String PASCALCASE_STRING = "Hello";

  @Test
  @DisplayName("Test that string is upper case")
  void testIsUpperCase() {
    Assertions.assertAll(
        () -> assertThat(isAllUpperCase(LOWERCASE_STRING)).isFalse(),
        () -> assertThat(isAllUpperCase(UPPERCASE_STRING)).isTrue(),
        () -> assertThat(isAllUpperCase(PASCALCASE_STRING)).isFalse());
  }

  @Test
  @DisplayName("Test that string is lowercase")
  void testIsLowercase() {
    Assertions.assertAll(
        () -> assertThat(isLowerCase(LOWERCASE_STRING)).isTrue(),
        () -> assertThat(isLowerCase(UPPERCASE_STRING)).isFalse(),
        () -> assertThat(isLowerCase(PASCALCASE_STRING)).isFalse());
  }

}