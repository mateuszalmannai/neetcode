package linkedIn.javaPractice.collections.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

public class ArrayAlgorithms {

  public static Integer linearSearch(int[] array, int item) {
    for (int current : array) {
      if (current == item) {
        return item;
      }
    }
    return null;
  }

  public static OptionalInt sequentialSearch(int[] array, int item) {
    return Arrays.stream(array).filter(element -> element == item).findFirst();
  }

  public static boolean binarySearch(int[] array, int item) {
    int min = 0;
    int max = array.length - 1;
    while (min <= max) {
      int mid = (min + max) / 2;
      if (item == array[mid]) {
        return true;
      } else if (item < array[mid]) {
        max = mid - 1;
      } else {
        min = mid + 1;
      }
    }
    return false;
  }

  public static int builtInBinarySearch(int[] array, int item) {
    return Arrays.binarySearch(array, item);
  }

  public static int[] findEvenNumbers(int[] arr1, int[] arr2) {
    List<Integer> result = new ArrayList<>();
    extractEvanIntegers(arr1, result);
    extractEvanIntegers(arr2, result);
    return result.stream()
        .mapToInt(Integer::intValue)
        .toArray();
  }

  private static void extractEvanIntegers(int[] arr1, List<Integer> result) {
    for (int num : arr1) {
      if (num % 2 == 0) {
        result.add(num);
      }
    }
  }

  public static int[] findEvenNumbersUsingStreams(int[] arr1, int[] arr2) {
    IntPredicate isEvenPredicate = num -> num % 2 == 0;
    return Stream.of(arr1, arr2)
        .flatMapToInt(Arrays::stream)
        .filter(isEvenPredicate)
        .toArray();
  }

  public static int[] reverseArray(int[] array) {
    int[] result = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      result[i] = array[array.length - 1 - i];
    }
    return result;
  }

  public static void reverseArrayInPlace(int[] array) {
    for (int i = 0; i < array.length / 2; i++) {
      // Swap item at index (i) and item at index  (array.length -i -1)
      int temp = array[i];
      array[i] = array[array.length - i - 1];
      array[array.length - i -1] = temp;
    }
  }
  public static void rotateArrayLeft(int[] array) {
    int temp = array[0];
    for (int i = 0; i < array.length - 1; i++) {
      array[i] = array[i + 1];
    }
    array[array.length - 1] = temp;
  }

  public static void rotateArrayRight(int[] array) {
    int temp = array[array.length - 1];
    for (int i = array.length - 1; i > 0; i--) {
      array[i] = array[i - 1];
    }
    array[0] = temp;
  }


}
