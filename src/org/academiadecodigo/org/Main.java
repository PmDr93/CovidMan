package org.academiadecodigo.org;

import org.academiadecodigo.Controls.Controls;
import org.academiadecodigo.MakeWords.MakeWords;
import org.academiadecodigo.Objects.Controllables.PacMan;
import org.academiadecodigo.graphics.Field;

public class Main {

    public static void main(String[] args) {
        /*
        Field field = new Field();
        field.init();

         */

        PacMan pacMan = new PacMan();



        Controls control = new Controls();
        control.setPacman(pacMan);
        control.init();



        Game game = new Game();
        game.start();

    }
}
