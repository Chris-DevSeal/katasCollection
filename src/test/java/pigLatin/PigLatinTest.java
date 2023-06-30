package pigLatin;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PigLatinTest {

    PigLatin pigLatin = new PigLatin();

    @ParameterizedTest
    @CsvSource({
            "igPay atinlay siay oolcay, Pig latin is cool",
            "elloHay orldway !, Hello world !"
    })
    void pigIt(String expected, String input) {
        String actual = pigLatin.pigIt(input);

        assertEquals(expected, actual);
    }
}