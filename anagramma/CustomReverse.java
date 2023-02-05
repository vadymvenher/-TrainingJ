package anagramma;

import java.util.StringJoiner;

public class CustomReverse {

    public String customReverse(String s) {
        StringBuilder result = new StringBuilder();
        for (String word : s.split(" ", 0)) {

            StringBuilder temp = new StringBuilder(word.replaceAll("[\\W\\d+]", "")).reverse();

            for (int i = 0; i < word.length(); i++) {
                if (!Character.isLetter(word.charAt(i))) {
                    temp.insert(i, word.charAt(i));
                }
            }
            result.append(temp).append(" ");

        }
        result.deleteCharAt(result.length() - 1);
        return result.toString().trim();

    }

}
