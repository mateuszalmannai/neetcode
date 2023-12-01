package linkedIn.javaPractice.collections.averageNumbersInList;

import java.util.List;

public class Answer {
  // Return the average value of the source list
  static double getAverage(List<Integer> source) {
    // Don't divide by 0
    if (source == null || source.isEmpty()) {
      return 0;
    }
    // Your code goes here.
    return source.stream().mapToInt(Integer::intValue).average().orElse(0.0);
  }

  static double getAverageViaSum(List<Integer> source) {
    // Don't divide by 0
    if (source == null || source.isEmpty()) {
      return 0;
    }
    return source.stream().reduce(0, Integer::sum) / (double) source.size();
  }
}
