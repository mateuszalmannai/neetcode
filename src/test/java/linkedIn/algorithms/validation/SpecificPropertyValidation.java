package linkedIn.algorithms.validation;

public class SpecificPropertyValidation {

  public static boolean isPasswordComplex(String password) {
    return password.chars().anyMatch(Character::isUpperCase) &&
        password.chars().anyMatch(Character::isLowerCase) &&
        password.chars().anyMatch(Character::isDigit);
  }
}
