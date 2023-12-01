package linkedIn.javaPractice.collections.averageNumbersInList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static linkedIn.javaPractice.collections.averageNumbersInList.Answer.getAverage;
import static linkedIn.javaPractice.collections.averageNumbersInList.Answer.getAverageViaSum;
import static org.assertj.core.api.Assertions.assertThat;


class AnswerTest {
  private List list1 = Arrays.asList(2,5,30,20,56);
  private double expected1 = 22.6;
  private List list2 = Arrays.asList(-20, 30, -55);
  private double expected2 = -15.0;
  @Test
  @DisplayName("testNaïveImplementation")
  void testNaïveImplementation() {
    Assertions.assertAll(
        () -> assertThat(getAverage(list1)).isEqualTo(expected1),
        () -> assertThat(getAverage(list2)).isEqualTo(expected2)
    );
  }

  @Test
  @DisplayName("Test provided Implementation")
  void testProvidedImplementation() {
    Assertions.assertAll(
        () -> assertThat(getAverageViaSum(list1)).isEqualTo(expected1),
        () -> assertThat(getAverageViaSum(list2)).isEqualTo(expected2)
    );

  }


}