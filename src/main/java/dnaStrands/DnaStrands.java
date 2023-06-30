package dnaStrands;

import java.util.HashMap;
import java.util.Map;

public class DnaStrands {
    public String makeComplement(String dna) {
        //Your code
        Map<String, String> dnaComplements = new HashMap<>();
        dnaComplements.put("A", "T");
        dnaComplements.put("C", "G");
        String[] dnaArr = dna.split("");
        StringBuilder newDna = new StringBuilder();
        for (String s : dnaArr) {
            for (Map.Entry<String, String> stringStringEntry : dnaComplements.entrySet()) {
                String currKey = stringStringEntry.getKey();
                String complement = stringStringEntry.getValue();
                if (s.equals(currKey)) {
                    newDna.append(complement);
                } else if (s.equals(complement)) {
                    newDna.append(currKey);
                }
            }
        }
        return newDna.toString();
    }
}
