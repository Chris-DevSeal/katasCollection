package Isogram;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle;
import static org.junit.jupiter.params.provider.Arguments.of;

@TestInstance(Lifecycle.PER_CLASS)
class IsogramTest {
    Isogram isogram = new Isogram();

    @ParameterizedTest
    @MethodSource("getStrings")
    void isIsogram(boolean expected, String string) {
        assertEquals(expected, isogram.isIsogram(string));
        assertEquals(expected, isogram.isIsogramV2(string));
        assertEquals(expected, isogram.isIsogramV3(string));
        assertEquals(expected, isogram.isIsogramV4(string));
    }

    Stream<Arguments> getStrings() {
        return Stream.of(
                of(true, "mon"),
                of(true, "Dermatoglyphics"),
                of(false, "Moose"),
                of(false, "Mmui"),
                of(true, "")
        );
    }
}