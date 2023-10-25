package edu.hw3;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AtbashTest {
    @Test
    void atbashGoodCaseTest(){
        String unencodedString = "Any fool can write code that a computer can understand." +
            " Good programmers write code that humans can understand. ― Martin Fowler";
        String encodedString = "Zmb ullo xzm dirgv xlwv gszg z xlnkfgvi xzm fmwvihgzmw." +
            " Tllw kiltiznnvih dirgv xlwv gszg sfnzmh xzm fmwvihgzmw. ― Nzigrm Uldovi";

        assertThat(Atbash.atbash(unencodedString)).isEqualTo(encodedString);
        assertThat(Atbash.atbash(encodedString)).isEqualTo(unencodedString);
    }

    @Test
    void atbashEmptyStringCaseTest(){
        String unencodedEmptyString = "";
        String encodedString = "";

        assertThat(Atbash.atbash(unencodedEmptyString)).isEqualTo(encodedString);
        assertThat(Atbash.atbash(encodedString)).isEqualTo(unencodedEmptyString);
    }

    @Test
    void atbashWithoutLatinCharactersCaseTest(){
        String unencodedWithoutLatinCharactersString = "ааабббввггддеежж   !В";

        assertThat(Atbash.atbash(unencodedWithoutLatinCharactersString))
            .isEqualTo(unencodedWithoutLatinCharactersString);
    }
}
