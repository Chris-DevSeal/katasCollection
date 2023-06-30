package pigLatin;

import java.util.Arrays;
import java.util.regex.Pattern;

import static java.util.stream.Collectors.joining;

public class PigLatin {
    public String pigIt(String input) {
        return Arrays.stream(input.split(" "))
                .map(this::moveFirstLetterToEnd)
                .map(this::addAyToEndOfWord)
                .collect(joining(" "));
    }

    private String moveFirstLetterToEnd(String word) {
        StringBuilder formattedWord = new StringBuilder();
        String[] letters = word.split("");
        for (int i = 1; i < letters.length; i++) {
            formattedWord.append(letters[i]);
        }
        formattedWord.append(letters[0]);
        return formattedWord.toString();
    }

    private String addAyToEndOfWord(String word) {
        if (Pattern.matches("\\p{Punct}", word)) {
            return word;
        }
        return String.format("%say", word);
    }
}
