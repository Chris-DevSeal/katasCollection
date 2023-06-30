package scramblies;

import java.util.Arrays;

public class Scramblies {
    public boolean scramble(String str1, String str2) {
        return Arrays.stream(str2.split(""))
                .filter(str1::contains)
                .filter(letter -> isCharCountValid(str1, str2, letter))
                .count() == str2.length();
    }

    private boolean isCharCountValid(String str1, String str2, String letter) {
        int countStr1 = str1.length() - str1.replace(letter, "").length();
        int countStr2 = str2.length() - str2.replace(letter, "").length();
        return countStr1 >= countStr2;
    }
}
