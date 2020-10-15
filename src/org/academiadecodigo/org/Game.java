package org.academiadecodigo.org;

import org.academiadecodigo.Controls.Controls;
import org.academiadecodigo.MakeWords.MakeWords;
import org.academiadecodigo.Objects.Characters;
import org.academiadecodigo.Objects.Controllables.PacMan;
import org.academiadecodigo.Objects.CovidFactory;
import org.academiadecodigo.Objects.GhostCovid;
import org.academiadecodigo.graphics.Field;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Game {

    private Field field;
    private int score;
    private PacMan pacMan;
    GhostCovid[] covids = new GhostCovid[5];
    MakeWords makewords = new MakeWords();
    private Picture picture;
    //private CovidFactory factory = new CovidFactory();

    public void start() {
        field = new Field();
        field.init();
        pacMan = new PacMan();
        Controls control = new Controls();
        control.setPacman(pacMan);
        control.init();
        field.countHearts(pacMan);



    }


}
