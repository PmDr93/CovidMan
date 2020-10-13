package org.academiadecodigo.org;

import org.academiadecodigo.Controls.Controls;
import org.academiadecodigo.MakeWords.MakeWords;
import org.academiadecodigo.Objects.Controllables.PacMan;
import org.academiadecodigo.graphics.Field;

public class Main {

    public static void main(String[] args) {
        /*Field field = new Field();
        field.init();

        PacMan pacMan = new PacMan();

        Controls control = new Controls();
        control.setPacman(pacMan);
        control.init();*/

        MakeWords word = new MakeWords();

        for (int i = 0; i < word.divideWord("banana").length; i++) {
            System.out.println(word.divideWord("banana")[i]);
        }



         
    }
}
