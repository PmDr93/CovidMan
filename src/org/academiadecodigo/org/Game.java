package org.academiadecodigo.org;

import javafx.stage.Screen;
import org.academiadecodigo.Controls.Controls;
import org.academiadecodigo.MakeWords.MakeWords;
import org.academiadecodigo.Objects.Characters;
import org.academiadecodigo.Objects.Controllables.PacMan;
import org.academiadecodigo.Objects.CovidFactory;
import org.academiadecodigo.Objects.GhostCovid;
import org.academiadecodigo.Objects.Syringe;
import org.academiadecodigo.graphics.Field;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game {

    private Field field;
    private int score;
    private boolean startGame;
    private PacMan pacMan;
    private GhostCovid[] covids;
    private Syringe syringe;
    private Picture picture;
    private CovidFactory factory = new CovidFactory();
    //private GhostCovid covid;
    private MakeWords words = new MakeWords();
    private Controls control = new Controls();
    private Picture startScreen = new Picture(10,10,"resources/test 2.png");

    Picture heart1 = new Picture(20, 20, "resources/Hearth.png");

    public void globalStart() throws InterruptedException {
        if(startGame){
            init();
            start();
        }
    }

    public void setStartGame(){
        startGame = true;
    }

    public void start() throws InterruptedException {

        while (startGame) {
            //start.delete();
            catchLetter();
            pacMan.syringeUsed();
            pacMan.killCovid(covids);
            pacMan.deadByGhost(covids);
            moveAll();

            if(pacMan.getLives() < 0){
                startGame = false;
                endScreen();
                return;
            }
        }
    }

    // iniciar todos os objectos dentro de campo
    public void init() throws InterruptedException {

        field = new Field();
        field.init();
        syringe = new Syringe();
        words.draw();
        heart1.draw();
        pacMan = new PacMan();
        control.setPacman(pacMan);
        control.init();
        covids = factory.covidFactory();
        pacMan.setSyringe(syringe);
        pacMan.setCovid(factory.getCovid());

    }

    public void moveAll() throws InterruptedException {

        //while(true) {
        for (GhostCovid ghost : covids) {
            ghost.moveInDirection();
        }
        //}

    }

    //pacman catch letters
    public void catchLetter() {
        Picture[] fieldWord = words.getCodigo();
        Picture[] downWord = words.getCodigoDown();

        if (fieldWord[0].getX() == this.pacMan.getX() && fieldWord[0].getY() == this.pacMan.getY()) {
            fieldWord[0].delete();
            downWord[0].draw();
        } else if (fieldWord[1].getX() == this.pacMan.getX() && fieldWord[1].getY() == this.pacMan.getY()) {
            fieldWord[1].delete();
            downWord[1].draw();
        } else if (fieldWord[2].getX() == this.pacMan.getX() && fieldWord[2].getY() == this.pacMan.getY()) {
            fieldWord[2].delete();
            downWord[2].draw();
        } else if (fieldWord[3].getX() == this.pacMan.getX() && fieldWord[3].getY() == this.pacMan.getY()) {
            fieldWord[3].delete();
            downWord[3].draw();
        } else if (fieldWord[4].getX() == this.pacMan.getX() && fieldWord[4].getY() == this.pacMan.getY()) {
            fieldWord[4].delete();
            downWord[4].draw();
        } else if (fieldWord[5].getX() == this.pacMan.getX() && fieldWord[5].getY() == this.pacMan.getY()) {
            fieldWord[5].delete();
            downWord[5].draw();
        } else if (fieldWord[6].getX() == this.pacMan.getX() && fieldWord[6].getY() == this.pacMan.getY()) {
            fieldWord[6].delete();
            downWord[6].draw();
        } else if (fieldWord[7].getX() == this.pacMan.getX() && fieldWord[7].getY() == this.pacMan.getY()) {
            fieldWord[7].delete();
            downWord[7].draw();
        }

    }

    public void startScreen() throws InterruptedException {
        control.initGame();
        control.setGame(this);
        startScreen.draw();
        while(startGame != true){
            Thread.sleep(10);
        }
        init();
        start();
    }

    public void deleteStart(){
        startScreen.delete();
    }

    public void endScreen(){ // FALTA ACRESCENTAR OBSTACLES.REMOVE E LETTERS.REMOVE
        pacMan.removeFromField();
        for(GhostCovid covid: covids){
            covid.removeFromField();
        }
        Picture gameOver = new Picture(200,150,"resources/gameove.jpg");
        gameOver.draw();

    }
}
