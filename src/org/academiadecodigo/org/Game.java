package org.academiadecodigo.org;


import org.academiadecodigo.Controls.Controls;
import org.academiadecodigo.MakeWords.MakeWords;
import org.academiadecodigo.Objects.Characters;
import org.academiadecodigo.Objects.Controllables.PacMan;
import org.academiadecodigo.Objects.CovidFactory;
import org.academiadecodigo.Objects.GhostCovid;
import org.academiadecodigo.Objects.Sound;
import org.academiadecodigo.Objects.Syringe;
import org.academiadecodigo.graphics.Field;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import javax.sound.sampled.LineUnavailableException;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Game {

    private Field field;
    private int score;
    private boolean startGame;
    private String[] lettersCaptured = new String[8];
    private PacMan pacMan;
    private GhostCovid[] covids;
    private Syringe syringe;
    private Picture picture;
    private CovidFactory factory = new CovidFactory ();
    //private GhostCovid covid;
    private MakeWords words = new MakeWords ();
    private Controls control = new Controls ();
    private Picture startScreen = new Picture (10, 10, "resources/test 2.png");
    private Sound menuMusic;

    Picture heart1 = new Picture (20, 20, "resources/Hearth.png");

    public void globalStart() throws InterruptedException, IOException, LineUnavailableException {

        if (startGame) {

            init ();

            start ();
        }
    }

    /*public void Musics() throws IOException, LineUnavailableException {
        this.menuMusic = new Sound ("resources/Sounds/dogbarking.wav");
    }*/

    public void setStartGame() {
        startGame = true;
    }

    public void start() throws InterruptedException, IOException, LineUnavailableException {

        while (startGame) {

            //start.delete();
            catchLetter ();
            pacMan.syringeUsed ();
            pacMan.killCovid (covids);
            pacMan.deadByGhost (covids);
            moveAll ();

            if (gugu.size () == 8) {
                startGame = false;
                pacMan.removeFromField ();
                for (Rectangle obs : field.getObstacles ()) {
                    obs.delete ();
                }
                for (GhostCovid covid : covids) {
                    covid.removeFromField ();
                }
                Picture picture = new Picture (100,80,"resources/you win 2.png");
                picture.draw ();
                return;
            }

            if (pacMan.getLives () < 0) {
                startGame = false;
                endScreen ();
                return;
            }
        }


    }

    // iniciar todos os objectos dentro de campo
    public void init() throws InterruptedException {
        field = new Field ();
        field.init ();
        syringe = new Syringe ();
        words.draw ();
        heart1.draw ();
        pacMan = new PacMan ();
        Controls control = new Controls ();
        control.setPacman (pacMan);
        control.init ();
        covids = factory.covidFactory ();
        pacMan.setSyringe (syringe);
        pacMan.setCovid (factory.getCovid ());


    }

    public void moveAll() throws InterruptedException {

        //while(true) {
        for (GhostCovid ghost : covids) {
            ghost.moveInDirection ();
        }
        //}

    }

    private Map<String, Integer> gugu = new HashMap<> ();

    //pacman catch letters
    public void catchLetter() {
        Picture[] fieldWord = words.getCodigo ();
        Picture[] downWord = words.getCodigoDown ();


        if (fieldWord[0].getX () == this.pacMan.getX () && fieldWord[0].getY () == this.pacMan.getY ()) {
            fieldWord[0].delete ();
            gugu.put ("s", 1);
            downWord[0].draw ();
        } else if (fieldWord[1].getX () == this.pacMan.getX () && fieldWord[1].getY () == this.pacMan.getY ()) {
            fieldWord[1].delete ();
            gugu.put ("a", 2);
            downWord[1].draw ();
        } else if (fieldWord[2].getX () == this.pacMan.getX () && fieldWord[2].getY () == this.pacMan.getY ()) {
            fieldWord[2].delete ();
            gugu.put ("b", 3);
            downWord[2].draw ();
        } else if (fieldWord[3].getX () == this.pacMan.getX () && fieldWord[3].getY () == this.pacMan.getY ()) {
            fieldWord[3].delete ();
            gugu.put ("c", 4);
            downWord[3].draw ();
        } else if (fieldWord[4].getX () == this.pacMan.getX () && fieldWord[4].getY () == this.pacMan.getY ()) {
            fieldWord[4].delete ();
            gugu.put ("d", 5);
            downWord[4].draw ();
        } else if (fieldWord[5].getX () == this.pacMan.getX () && fieldWord[5].getY () == this.pacMan.getY ()) {
            fieldWord[5].delete ();
            gugu.put ("e", 5);
            downWord[5].draw ();
        } else if (fieldWord[6].getX () == this.pacMan.getX () && fieldWord[6].getY () == this.pacMan.getY ()) {
            fieldWord[6].delete ();
            gugu.put ("g", 3);
            downWord[6].draw ();
        } else if (fieldWord[7].getX () == this.pacMan.getX () && fieldWord[7].getY () == this.pacMan.getY ()) {
            fieldWord[7].delete ();
            gugu.put ("f", 7);
            downWord[7].draw ();
        }

    }

    public void startScreen() throws InterruptedException, IOException, LineUnavailableException {
        control.initGame ();
        control.setGame (this);
        startScreen.draw ();
        while (startGame != true) {
            Thread.sleep (10);
        }
        init ();
        start ();
    }

    public void deleteStart() {
        startScreen.delete ();
    }

    public void endScreen() { // FALTA ACRESCENTAR OBSTACLES.REMOVE E LETTERS.REMOVE
        pacMan.removeFromField ();
        for (Rectangle obs : field.getObstacles ()) {
            obs.delete ();
        }
        for (GhostCovid covid : covids) {
            covid.removeFromField ();
        }
        Picture gameOver = new Picture (50, 80, "resources/gameover2.png");
        gameOver.draw ();


    }
}
