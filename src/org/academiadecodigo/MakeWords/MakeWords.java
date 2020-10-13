package org.academiadecodigo.MakeWords;

public class MakeWords {

    private String word1 = "banana";

    public String[] divideWord(String word) {
        String[] divide = word.split("");

        return divide;
    }



    public String getWord() {
        return word1;
    }
}
