package linkedIn.javaPractice.collections.wordOccurencesInString;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static linkedIn.javaPractice.collections.wordOccurencesInString.Answer.getStreamedOccurences;
import static org.assertj.core.api.Assertions.assertThat;

class AnswerTest {

  private static final String SOURCE_1 = "Here is an example. Right here.";
  private static final String WORD_1 = "here";
  private static final String SOURCE_2 = "There was once a cat";
  private static final String WORD_2 = "dog";
  private static final String SOURCE_3 = "It was a long day. It was also hot outside. That's how it was.";
  private static final String WORD_3 = "it";

  @Test
  @DisplayName("testNaïveImplementation")
  void testNaïveImplementation() {
    Assertions.assertAll(
        () -> assertThat(Answer.getOccurrences(SOURCE_1, WORD_1)).isEqualTo(2),
        () -> assertThat(Answer.getOccurrences(SOURCE_2, WORD_2)).isEqualTo(0),
        () -> assertThat(Answer.getOccurrences(SOURCE_3, WORD_3)).isEqualTo(3)
    );
  }
  @Test
  @DisplayName("testStreamSolution")
  void testStreamSolution() {
    Assertions.assertAll(
        () -> assertThat(getStreamedOccurences(SOURCE_1, WORD_1)).isEqualTo(2),
        () -> assertThat(getStreamedOccurences(SOURCE_2, WORD_2)).isEqualTo(0),
        () -> assertThat(getStreamedOccurences(SOURCE_3, WORD_3)).isEqualTo(3)
    );
  }


}