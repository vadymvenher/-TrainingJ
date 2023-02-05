package anagramma;

import java.util.Scanner;

public class EnterSentence {

    public String enterSentence() {
        Scanner myObj = new Scanner(System.in);
        String s = myObj.nextLine();
        return s;
    }

}
