package test;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

class UserTest {
    User user = new User("Marco", 37, false, LocalDate.now().minusYears(37));


    @Test
    void userShouldBeAtLeast18() {
        assertThat(user.age()).isGreaterThanOrEqualTo(18);
    }

    @Test
    void userShouldNotBeBlocked() {
        assertThat(user.blocked())
                .as("User %s should not be blocked", user.name())
                .isFalse();
    }

    @Test
    void userNameShouldBeMarco() {
        assertThat(user.name()).startsWith("Marc");
    }
}
