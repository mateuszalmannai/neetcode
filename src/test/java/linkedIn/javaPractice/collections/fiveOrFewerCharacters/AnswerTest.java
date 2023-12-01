package linkedIn.javaPractice.collections.fiveOrFewerCharacters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static linkedIn.javaPractice.collections.fiveOrFewerCharacters.Answer.findFiveOrFewer;
import static org.assertj.core.api.Assertions.assertThat;


class AnswerTest {

  @Test
  @DisplayName("TestFindFiveOrFewer")
  void testFindFiveOrFewer() {
    Assertions.assertAll(
        () -> assertThat(findFiveOrFewer("a string of mostly smaller words")).isEqualTo(List.of("a", "of", "words")),
        () -> assertThat(findFiveOrFewer("new string with new words")).isEqualTo(List.of("new", "with", "new", "words")),
        () -> assertThat(findFiveOrFewer("there are both smaller and bigger words here")).isEqualTo(List.of("there", "are", "both", "and", "words", "here"))
    );
  }


}