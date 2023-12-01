package linkedIn.javaPractice.collections.reverseString;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static linkedIn.javaPractice.collections.reverseString.Answer.getReversed;
import static org.assertj.core.api.Assertions.assertThat;

class AnswerTest {

  @Test
  @DisplayName("Test reversed list")
  void testGetReversed() {
    Assertions.assertAll(
        () -> assertThat(getReversed(Arrays.asList(2, 5, 30, 56))).isEqualTo(List.of(56, 30, 5, 2)),
        () -> assertThat(getReversed(Arrays.asList(-56, 30, -20))).isEqualTo(List.of(-20, 30, -56))
    );
  }


}