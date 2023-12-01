package linkedIn.javaPractice.collections.twoSum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static linkedIn.javaPractice.collections.twoSum.Answer.*;
import static org.assertj.core.api.Assertions.assertThat;


class AnswerTest {
  private List<Integer> exampleList1 = Arrays.asList(1, 2, 3);
  private int target1 = 3;
  private List<Integer> expectedList1 = List.of(0, 1);
  private List<Integer> exampleList2 = Arrays.asList(4, 5, 6, 8);
  private int target2 = 13;
  private List<Integer> expectedList2 = List.of(1, 3);
  private List<Integer> exampleList3 = Arrays.asList(7, 17, 13, 19, 55);
  private int target3 = 26;
  private List<Integer> expectedList3 = List.of(0, 3);

  @Test
  @DisplayName("Test 0(n) complexity")
  void testFindTwoSum() {
    Assertions.assertAll(
        () -> assertThat(findTwoSum(exampleList1, target1)).isEqualTo(expectedList1),
        () -> assertThat(findTwoSum(exampleList2, target2)).isEqualTo(expectedList2),
        () -> assertThat(findTwoSum(exampleList3, target3)).isEqualTo(expectedList3)
    );
  }

  @Test
  @DisplayName("Test O(n^2) complexity")
  void testTwoSumBruteForce() {
    Assertions.assertAll(
        () -> assertThat(twoSumBruteForce(exampleList1, target1)).isEqualTo(expectedList1),
        () -> assertThat(twoSumBruteForce(exampleList2, target2)).isEqualTo(expectedList2),
        () -> assertThat(twoSumBruteForce(exampleList3, target3)).isEqualTo(expectedList3)
    );
  }

  @Test
  @DisplayName("Test O(n*log(n) complexity")
  void testTwoSumSorting() {
    Assertions.assertAll(
        () -> assertThat(twoSumSorting(exampleList1, target1)).isEqualTo(expectedList1),
        () -> assertThat(twoSumSorting(exampleList2, target2)).isEqualTo(expectedList2),
        () -> assertThat(twoSumSorting(exampleList3, target3)).isEqualTo(expectedList3)
    );
  }


}