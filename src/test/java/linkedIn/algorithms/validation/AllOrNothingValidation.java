package linkedIn.algorithms.validation;

public class AllOrNothingValidation {

  public static boolean isAllUpperCase(String input) {
    return input.chars().allMatch(Character::isUpperCase);
  }
  public static boolean isLowerCase(String input) {
    return input.chars().allMatch(Character::isLowerCase);
//    return input.chars().noneMatch(Character::isUpperCase);
  }
}
