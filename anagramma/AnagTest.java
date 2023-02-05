package anagramma;

public class AnagTest {

    public static void main(String[] args) {
        System.out.println(customReverse("ab!cd! 21ef 2g3h4"));
    }

    private static String customReverse(String s){
        StringBuilder result = new StringBuilder(s.replaceAll("[\\W\\d+]","")).reverse();

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLetter(s.charAt(i))){
                result.insert(i, s.charAt(i));
            }
        }
        return result.toString();
    }
}
