package twoToOne;

import java.util.*;
import java.util.stream.Collectors;

public class TwoToOne {
    public String longest(String s1, String s2) {
        String[] s1Array = s1.split("");
        String[] s2Array = s2.split("");

        Set<String> mainSet = Arrays.stream(s1Array).collect(Collectors.toSet());
        Set<String> scndSet = Arrays.stream(s2Array).collect(Collectors.toSet());
        mainSet.addAll(scndSet);
        List<String> sList = new ArrayList<>(mainSet);
        Collections.sort(sList);
        return String.join("", sList);
    }
}
