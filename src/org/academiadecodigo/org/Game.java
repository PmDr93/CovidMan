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
    private MakeWords words;


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
        pacMan = new PacMan(this);
        Controls control = new Controls();
        control.setPacman(pacMan);
        control.init();
        field.countHearts(pacMan);
        syringe = new Syringe();
        covids = factory.covidFactory();

        words = new MakeWords();
    }

    public void moveAll() throws InterruptedException {

        while(true) {
            for (GhostCovid ghost : covids) {
                ghost.moveInDirection();
            }
        }

    }
    //pacman catch letters
    public void catchLetter() {
        Picture[] fieldWord = words.getCodigo();
        Picture[] downWord = words.getCodigoDown();

        if (fieldWord[0].getX() == pacMan.getX() && fieldWord[0].getY() == pacMan.getY()) {
            fieldWord[0].delete();
            downWord[0].draw();
        } else if (fieldWord[1].getX() == pacMan.getX() && fieldWord[1].getY() == pacMan.getY()) {
            fieldWord[1].delete();
            downWord[1].draw();
        } else if (fieldWord[2].getX() == pacMan.getX() && fieldWord[2].getY() == pacMan.getY()) {
            fieldWord[2].delete();
            downWord[2].draw();
        } else if (fieldWord[3].getX() == pacMan.getX() && fieldWord[3].getY() == pacMan.getY()) {
            fieldWord[3].delete();
            downWord[3].draw();
        } else if (fieldWord[4].getX() == pacMan.getX() && fieldWord[4].getY() == pacMan.getY()) {
            fieldWord[4].delete();
            downWord[4].draw();
        } else if (fieldWord[5].getX() == pacMan.getX() && fieldWord[5].getY() == pacMan.getY()) {
            fieldWord[5].delete();
            downWord[5].draw();
        } else if (fieldWord[6].getX() == pacMan.getX() && fieldWord[6].getY() == pacMan.getY()) {
            fieldWord[6].delete();
            downWord[6].draw();
        } else if (fieldWord[7].getX() == pacMan.getX() && fieldWord[7].getY() == pacMan.getY()) {
            fieldWord[7].delete();
            downWord[7].draw();
        }

    }

}
