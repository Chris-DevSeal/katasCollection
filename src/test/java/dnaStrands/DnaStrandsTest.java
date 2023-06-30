package dnaStrands;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DnaStrandsTest {
    private final DnaStrands dnaStrands = new DnaStrands();

    @ParameterizedTest
    @MethodSource("getDnaData")
    void makeComplementTest(String expected, String input) {

        Assertions.assertEquals(expected, dnaStrands.makeComplement(input));
    }

    Stream<Arguments> getDnaData() {
        return Stream.of(
                Arguments.of("ATCG", "TAGC")
        );
    }
}
