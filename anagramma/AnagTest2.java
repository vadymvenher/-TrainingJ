package anagramma;



public class AnagTest2 {
    private static String customReverse(String s) {
        StringBuilder result = new StringBuilder();

        for (String word : s.split(" ")) {

            StringBuilder temp = new StringBuilder(word.replaceAll("[\\W\\d+]", "")).reverse();

            for (int i = 0; i < word.length(); i++) {
                if (!Character.isLetter(word.charAt(i))) {
                    temp.insert(i, word.charAt(i));
                }
            }
            result.append(temp).append(" ");

        }
        result.deleteCharAt(result.length() - 1);
        // result.replaceAll(".$", "");
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(customReverse("ab!cd! 21efui 2g3h4 2g3h4"));
    }
}
