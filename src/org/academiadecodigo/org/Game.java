package org.academiadecodigo.org;

import org.academiadecodigo.Controls.Controls;
import org.academiadecodigo.Objects.Controllables.PacMan;
import org.academiadecodigo.Objects.CovidFactory;
import org.academiadecodigo.Objects.GhostCovid;
import org.academiadecodigo.Objects.Syringe;
import org.academiadecodigo.graphics.Field;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.awt.*;

public class Game {

    private Field field;
    private int score;

    private PacMan pacMan;
    private Syringe syringe;
    private Picture picture;
    //private CovidFactory factory = new CovidFactory();
    private GhostCovid covid;


    public void init() throws InterruptedException {
        field = new Field();
        field.init();
        pacMan = new PacMan(3);
        syringe = new Syringe();
        Controls control = new Controls();
        control.setPacman(pacMan);
        control.init();
        covid = new GhostCovid(810, 500);
        //field.countHearts(pacMan);
        pacMan.setSyringe(syringe);
        pacMan.setCovid(covid);




    }

    public void start() {
        hearts();
    }


    //create and remove hearts/lives
    public void hearts() {
        Picture heart1 = new Picture(20, 20, "resources/Hearth.png");
        heart1.draw();
        Picture heart2 = new Picture(50, 20, "resources/Hearth.png");
        heart2.draw();
        Picture heart3 = new Picture(80, 20, "resources/Hearth.png");
        heart3.draw();

        if (pacMan.getLives() == 2) {
            heart3.delete();
        } else if (pacMan.getLives() == 1) {
            heart2.delete();
        } else if (pacMan.getLives() == 0){
            heart1.delete();
        }
    }

}
