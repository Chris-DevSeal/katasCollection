package findUniqueString;

import java.util.List;

public class UniqueStringFinder {
    public static String findUniqueString(List<String> strings) {
        for (String string : strings) {
            List<String> str = strings.stream().filter(s -> s.equals(string)).toList();
            if (str.size() == 1) {
                return str.get(0);
            }
        }
        throw new RuntimeException("No Unique String found");
    }
}
