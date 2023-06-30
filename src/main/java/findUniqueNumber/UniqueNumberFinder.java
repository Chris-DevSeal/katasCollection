package findUniqueNumber;

import java.util.Arrays;

public class UniqueNumberFinder {
    public static double findUniqueNumber(double[] numbers) throws IllegalArgumentException {
        Arrays.sort(numbers);
        if (numbers.length < 3) {
            throw new IllegalArgumentException("All Numbers are unique");
        }
        if (noUniqueNumber(numbers)) {
            throw new IllegalArgumentException("No Unique Number");
        }
        return numbers[0] == numbers[1] ? numbers[numbers.length - 1] : numbers[0];
    }

    private static boolean noUniqueNumber(double[] nums) {
        return (nums[0] == nums[1]) && (nums[nums.length - 2] == nums[nums.length - 1]);
    }

    public static double findUniqueNumberi(double[] numbers) {
        for (double number : numbers) {
            double[] res = Arrays.stream(numbers)
                    .filter(n -> n == number)
                    .toArray();
            if (res.length == 1) {
                return res[0];
            }
        }
        throw new RuntimeException("No unique number given");
    }
}
