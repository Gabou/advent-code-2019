package advent.code;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class FailTest {

    @Test
    void shouldBeFalse() {

        assertThat(false).isTrue();
    }
}