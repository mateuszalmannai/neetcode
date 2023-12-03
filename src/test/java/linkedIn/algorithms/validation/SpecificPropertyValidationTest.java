package linkedIn.algorithms.validation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SpecificPropertyValidationTest {

  @Test
  @DisplayName("Test password complexity")
  void testPasswordComplexity() {
    Assertions.assertAll(
        () -> assertThat(SpecificPropertyValidation.isPasswordComplex("Hell0")).isTrue(),
        () -> assertThat(SpecificPropertyValidation.isPasswordComplex("Hello")).isFalse(),
        () -> assertThat(SpecificPropertyValidation.isPasswordComplex("HellO")).isFalse(),
        () -> assertThat(SpecificPropertyValidation.isPasswordComplex("HeLLo")).isFalse(),
        () -> assertThat(SpecificPropertyValidation.isPasswordComplex("hell0")).isFalse()
    );
  }

}