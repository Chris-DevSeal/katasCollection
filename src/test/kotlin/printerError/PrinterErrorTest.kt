package printerError

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class PrinterErrorTest {

    @ParameterizedTest
    @CsvSource(
        "3/56, aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz",
        "6/60, kkkwwwaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz",
        "2/4,aAoO",
        "2/4,aoAO",
        "2/4, AOao",
    )
    fun printerError(expected: String, input: String) {
        val actual = printerError(input)
        val actual2 = printError2(input)

        assertEquals(expected, actual)
        assertEquals(expected, actual2)
    }
}