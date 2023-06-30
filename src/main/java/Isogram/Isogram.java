package Isogram;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Isogram {
    public boolean isIsogram(String string) {
        String lowerCaseString = string.toLowerCase();
        String isogramString = Arrays.stream(lowerCaseString.split(""))
                .distinct()
                .collect(Collectors.joining(""));
        return lowerCaseString.equals(isogramString);
    }

    public boolean isIsogramV2(String string) {
        return string.length() == string
                .toLowerCase()
                .chars()
                .distinct()
                .count();
    }

    public boolean isIsogramV3(String string) {
        String[] stringArr = string.toLowerCase().split("");
        return stringArr.length == Arrays.stream(stringArr)
                .collect(Collectors.toSet())
                .size();
    }

    public boolean isIsogramV4(String string) {
        return string.length() == string.chars()
                .map(Character::toLowerCase)
                .distinct()
                .count();
    }
}
