package org.academiadecodigo.org;

import org.academiadecodigo.Controls.Controls;
import org.academiadecodigo.MakeWords.MakeWords;
import org.academiadecodigo.Objects.Controllables.PacMan;
import org.academiadecodigo.graphics.Field;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Game game = new Game();

        game.init();
        game.start();


    }
}
