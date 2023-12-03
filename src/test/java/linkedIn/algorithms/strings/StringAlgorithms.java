package linkedIn.algorithms.strings;

public class StringAlgorithms {
  public static String reverseStringFromFirstPrinciples(String input) {
    if (input == null || input.isEmpty()) {
      return input;
    }

    StringBuilder reversed = new StringBuilder();
    for (int i = input.length() - 1; i >= 0 ; i--) {
      reversed.append(input.charAt(i));
    }
    return reversed.toString();
  }

  public static String reverseStringBuiltIn(String input) {
    if (input == null || input.isEmpty()) {
      return input;
    }
    return new StringBuilder(input).reverse().toString();
  }

  public static String reverseEachWord(String input) {
    if (input == null || input.isEmpty() || input.isBlank()) {
      return input;
    }
    String[] words = input.split("\\s+");

    StringBuilder reversed = new StringBuilder();
    for (int i = 0; i < words.length; i++) {
      reversed.append(reverseStringBuiltIn(words[i]));
      if (i != words.length -1) {
        reversed.append(" ");
      }
    }
    return reversed.toString();
  }
}
