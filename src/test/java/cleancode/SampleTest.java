package cleancode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SampleTest {

    @Test
    void sample() {
        // given
        int a = 1;
        int b = 2;

        // when
        int sum = a + b;

        // then
        assertThat(sum).isEqualTo(3);
    }
}
