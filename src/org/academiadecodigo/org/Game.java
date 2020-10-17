package org.academiadecodigo.org;

import org.academiadecodigo.Controls.Controls;
import org.academiadecodigo.MakeWords.MakeWords;
import org.academiadecodigo.Objects.Characters;
import org.academiadecodigo.Objects.Controllables.PacMan;
import org.academiadecodigo.Objects.CovidFactory;
import org.academiadecodigo.Objects.GhostCovid;
import org.academiadecodigo.Objects.Syringe;
import org.academiadecodigo.graphics.Field;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Game {

    private Field field;
    private int score;
    private PacMan pacMan;
    private GhostCovid[] covids;
    private Syringe syringe;
    private Picture picture;
    private CovidFactory factory = new CovidFactory();


    // start the game, objects start to move
    public void start() throws InterruptedException {
        /**
        field = new Field();
        field.init();
        pacMan = new PacMan();
        Controls control = new Controls();
        control.setPacman(pacMan);
        control.init();
        field.countHearts(pacMan);
        syringe = new Syringe();
        factory.covidFactory();
         */

        moveAll();
    }

    // iniciar todos os objectos dentro de campo
    public void init() throws InterruptedException {
        field = new Field();
        field.init();
        pacMan = new PacMan();
        Controls control = new Controls();
        control.setPacman(pacMan);
        control.init();
        field.countHearts(pacMan);
        syringe = new Syringe();
        covids = factory.covidFactory();
    }

    public void moveAll() throws InterruptedException {
        for(GhostCovid ghost: covids){
            if (!ghost.isDead()) {
                ghost.moveInDirection();
            }

        }
    }
}
