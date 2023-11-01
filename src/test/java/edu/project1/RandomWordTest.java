package edu.project1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RandomWordTest {

    @Test
    void CheckStateLoseTest() {
        assertThat(RandomWord.getRandomString()).isNotNull();
    }

}
