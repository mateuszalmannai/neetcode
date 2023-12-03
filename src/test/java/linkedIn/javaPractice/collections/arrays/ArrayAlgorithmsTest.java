package linkedIn.javaPractice.collections.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.OptionalInt;

import static linkedIn.javaPractice.collections.arrays.ArrayAlgorithms.*;
import static org.assertj.core.api.Assertions.assertThat;

class ArrayAlgorithmsTest {
  private int[] array = {1, 2, 3, 4, 5, 6};
  @Test
  @DisplayName("Test linear search")
  void testLinearSearch() {
    Assertions.assertAll(
        () -> assertThat(linearSearch(array, 1)).isEqualTo(1),
        () -> assertThat(linearSearch(array, 8)).isNull()
    );
  }

  @Test
  @DisplayName("Test sequential search")
  void testSequentialSearch() {
    Assertions.assertAll(
        () -> assertThat(Optional.of(sequentialSearch(array, 1))).hasValue(OptionalInt.of(1)),
        () -> assertThat(Optional.of(sequentialSearch(array, 8))).hasValue(OptionalInt.empty())
    );
  }

  @Test
  @DisplayName("Test binary search")
  void testBinarySearch() {
    Assertions.assertAll(
        () -> assertThat(binarySearch(array, 3)).isTrue(),
        () -> assertThat(binarySearch(array, 1)).isTrue(),
        () -> assertThat(binarySearch(array, 8)).isFalse()
    );
  }

  @Test
  @DisplayName("Test built-in binary search")
  void testBuiltInBinarySearch() {
    Assertions.assertAll(
        () -> assertThat(builtInBinarySearch(array, 3)).isEqualTo(2),
        () -> assertThat(builtInBinarySearch(array, 1)).isEqualTo(0),
        () -> assertThat(builtInBinarySearch(array, 8)).isEqualTo(-7)
    );
  }

  @Test
  @DisplayName("Test find even numbers in two arrays")
  void testFindEvenNumbersInTwoArrays() {
    int[] array1 = {-9, 3, 2, -8, 12, -16};
    int[] array2 = {0, -3, -8, -35, 40, 20, 7};

    int[] resultArray = {2, -8, 12, -16, 0, -8, 40, 20};

    Assertions.assertAll(
        () -> assertThat(findEvenNumbers(array1, array2)).isEqualTo(resultArray),
        () -> assertThat(findEvenNumbersUsingStreams(array1, array2)).isEqualTo(resultArray)
    );
  }

  private int[] input = {1, 2, 3, 4, 5, 6};

  @Test
  @DisplayName("Test reverse array")
  void testReverseArray() {

    int[] resultArray = {6, 5, 4, 3, 2, 1};

    assertThat(reverseArray(input)).isEqualTo(resultArray);
    reverseArrayInPlace(input);
    assertThat(input).isEqualTo(resultArray);
    reverseArrayInPlace(input);
    assertThat(input).isEqualTo(new int[]{1, 2, 3, 4, 5, 6});
  }

  @Test
  @DisplayName("Test rotate array left")
  void testRotateArrayLeft() {
    rotateArrayLeft(input);
    assertThat(input).isEqualTo(new int[]{2, 3, 4, 5, 6, 1});
  }

  @Test
  @DisplayName("Test rotate array right")
  void testRotateArrayRight() {
    rotateArrayRight(input);
    assertThat(input).isEqualTo(new int[]{6, 1, 2, 3, 4, 5});
    rotateArrayLeft(input);
    assertThat(input).isEqualTo(new int[]{1, 2, 3, 4, 5, 6});
  }


}