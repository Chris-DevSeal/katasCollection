package kidsWiththeGreatestNumberofCandies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindKid {
    public List<Boolean> getKidWithMostCandies(int[] candies, int extraCandy) {
        List<Boolean> kids = new ArrayList<>();
        for (int candy : candies) {
            int totalCandies = candy + extraCandy;
            kids.add(hasMostCandies(candies, totalCandies));
        }
        return kids;
    }

    private static boolean hasMostCandies(int[] candies, int totalCandies) {
        return totalCandies >= Arrays.stream(candies).max().getAsInt();
    }
}
