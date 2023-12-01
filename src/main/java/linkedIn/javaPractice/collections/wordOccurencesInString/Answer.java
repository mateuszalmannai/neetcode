package linkedIn.javaPractice.collections.wordOccurencesInString;

import java.util.Arrays;

public class Answer {
  // Return the number of occurrences of word in source
  static int getOccurrences(String source, String word) {
    // Your code goes here.
    String string = source.toLowerCase();

    int count = 0;
    int index = string.indexOf(word);

    while (index != -1) {
      count++;
      index = string.indexOf(word, index + word.length());
    }

    return count;
  }

  static int getStreamedOccurences(String source, String word) {
    String cleanedUpString = source.replaceAll("\\.", "");
    return (int) Arrays.stream(cleanedUpString.split(" "))
        .filter(w -> w.equalsIgnoreCase(word))
        .count();
  }

}
