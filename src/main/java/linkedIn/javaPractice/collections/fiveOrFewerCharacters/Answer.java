package linkedIn.javaPractice.collections.fiveOrFewerCharacters;

import java.util.Arrays;
import java.util.List;

public class Answer {
  // Return the a list of words with 5 or fewer characters
  static List<String> findFiveOrFewer(String source) {
    return Arrays.stream(source.split(" "))
        .filter(word -> word.length() <= 5)
        .toList();
  }
}
