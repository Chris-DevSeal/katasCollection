package sumOfASequence;

public class SumOfASequence {
    public int sequenceSum(int start, int end, int step) {
        int sum = 0;
        int current = start;
        while (current <= end) {
            sum += current;
            current += step;
        }
        return sum;
    }

    public int sequenceSumV2(int start, int end, int step) {
        int sum = 0;
        for (int current = start; current <= end; current += step) {
            sum += current;
        }
        return sum;
    }
}
