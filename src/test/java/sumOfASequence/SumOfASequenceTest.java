package sumOfASequence;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SumOfASequenceTest {
    private final SumOfASequence sumOfASequence = new SumOfASequence();

    @ParameterizedTest
    @CsvSource({
            "2,6,2,12",
            "5,4,1,0",
            "6,6,1,6",
            "1,5,3,5",
            "0,0,0,0"
    })
    void sequenceSum(int start, int end, int step, int expected) {
        int actualV1 = sumOfASequence.sequenceSum(start, end, step);
        int actualV2 = sumOfASequence.sequenceSumV2(start, end, step);
        assertEquals(expected, actualV1);
        assertEquals(expected, actualV2);
    }

}