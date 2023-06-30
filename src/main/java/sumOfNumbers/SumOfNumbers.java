package sumOfNumbers;

import java.util.Comparator;
import java.util.List;

public class SumOfNumbers {
    public int getSum(int a, int b) {
        List<Integer> numbers = List.of(a, b);
        int minNumber = numbers.stream()
                .min(Comparator.naturalOrder())
                .orElse(a);
        int maxNumber = numbers.stream()
                .max(Comparator.naturalOrder())
                .orElse(b);
        int result = minNumber;
        for (int i = minNumber; i < maxNumber; i++) {
            result += i + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        SumOfNumbers sumOfNumbers = new SumOfNumbers();
        int sum = sumOfNumbers.getSum(1, 0);
        System.out.println("sum = " + sum);
    }
}
