package anagramma;

public class Reverse {

    public static void main(String[] args) {
        String text = "ab!cd e3fgh bhj9bnj";
        char[] textArray = text.toCharArray();

        // reverse the words
        for (int i = 0; i < textArray.length; i++) {
            if (Character.isLetter(textArray[i])) {
                int j = i;
                while (i < textArray.length && Character.isLetter(textArray[i])) {
                    i++;
                }
                reverseString(textArray, j, i-1);
            }
        }

        System.out.println(String.valueOf(textArray));
    }

    public static void reverseString(char[] textArray, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            char temp = textArray[startIndex];
            textArray[startIndex] = textArray[endIndex];
            textArray[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }
}
