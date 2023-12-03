package linkedIn.algorithms.noramlization;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static linkedIn.algorithms.noramlization.NormalizeApp.normalizeString;
import static org.assertj.core.api.Assertions.assertThat;

class NormalizeAppTest {

  @Test
  @DisplayName("Test String Normalisation")
  void testStringNormalisation() {
    assertThat(normalizeString("  Hello There, BUDDY ")).isEqualTo("hello there buddy");
  }



}