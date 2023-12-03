package linkedIn.algorithms.noramlization;

public class NormalizeApp {

  public static String normalizeString(String input) {
    return input
        .toLowerCase()
        .trim()
        .replace(",", "");
  }
}
