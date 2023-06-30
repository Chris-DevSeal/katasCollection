package rgbToHeyConverter;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(PER_CLASS)
class RGBToHexConverterTest {
    private final RGBToHexConverter converter = new RGBToHexConverter();

    @ParameterizedTest
    @MethodSource("getRGBCodes")
    void rgb(String expected, List<Integer> input) {
        String actual = converter.rgb(input.get(0), input.get(1), input.get(2));
        assertEquals(expected, actual);
    }

    public Stream<Arguments> getRGBCodes() {
        return Stream.of(
                Arguments.of("000000", List.of(0, 0, 0))
        );

    }
}