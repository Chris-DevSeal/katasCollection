package countCharacters;

import java.util.HashMap;
import java.util.Map;

public class CountCharacters {
    public Map<Character, Integer> count(String str) {
        Map<Character, Integer> count = new HashMap<>();
        for (char c : str.toCharArray()) {
            Integer initialCount = count.getOrDefault(c, 0);
            count.put(c, ++initialCount);
        }
        return count;
    }
}
