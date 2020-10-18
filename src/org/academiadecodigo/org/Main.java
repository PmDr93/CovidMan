package org.academiadecodigo.org;

import org.academiadecodigo.Controls.Controls;
import org.academiadecodigo.MakeWords.MakeWords;
import org.academiadecodigo.Objects.Controllables.PacMan;
import org.academiadecodigo.graphics.Field;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import javax.sound.sampled.LineUnavailableException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException, LineUnavailableException {

        Game game = new Game();

        game.startScreen();
        game.globalStart();


    }
}
