package linkedIn.javaPractice.collections.reverseString;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Answer {
  // Change these boolean values to control whether you see
  // the expected result and/or hints.
  static boolean showExpectedResult = false;
  static boolean showHints = false;

  // Return a new list in reversed order
  static List<Integer> getReversed(List<Integer> source) {
    // Your code goes here.
    List<Integer> result = new ArrayList(source);
    Collections.reverse(result);
    return result;
  }

}
