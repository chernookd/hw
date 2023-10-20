package edu.project1;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
public class DictionaryTest {
    @Test
    public void StringSplittingGoodCaseTest() {
        Dictionary dictionary = new Dictionary();
        StringBuilder str = new StringBuilder(" aaa bbb ccc ddd ");

        String[] res = dictionary.stringSplitting(str);

        assertArrayEquals(new String[]{"aaa", "bbb", "ccc", "ddd"}, res);
    }

    @Test
    public void StringSplittingBadCaseTest() {
        Dictionary dictionary = new Dictionary();
        StringBuilder str = new StringBuilder(" aaa   bbb   ccc     ddd ");

        String[] res = dictionary.stringSplitting(str);

        assertArrayEquals(new String[]{"aaa", "bbb", "ccc", "ddd"}, res);
    }

    @Test
    public void getWordTest() {
        Dictionary dictionary = new Dictionary();

        assertThat(dictionary.getWords()).isNotNull();
        try {
            dictionary.setWords();
            assertThat(dictionary.getWords()).isNotNull();
        } catch (IOException ignored){
        }
    }
}
