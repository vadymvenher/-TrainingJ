package anagramma;

public class Anagrams {
    EnterSentence enter = new EnterSentence();
    CustomReverse cr = new CustomReverse();

    void onAnagrams () {
        //enter.enterSentence();
        //cr.customReverse(enter.enterSentence());
        System.out.println(cr.customReverse(enter.enterSentence()));
    }

}
