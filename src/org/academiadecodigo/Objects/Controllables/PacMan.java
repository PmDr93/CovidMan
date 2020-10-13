package org.academiadecodigo.Objects.Controllables;

import org.academiadecodigo.Objects.Characters;
import org.academiadecodigo.Objects.GhostCovid;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class PacMan extends Characters implements Controllable {

    private Picture picture;
    private GhostCovid ghost;
    private Ellipse pacman;

    public PacMan(){
        this.pacman = new Ellipse(40,40,25,25);
        this.pacman.fill();
    }

    @Override
    public void moveRight() {
        pacman.translate(20,0);

    }

    @Override
    public void moveLeft() {
        pacman.translate(-20,0);

    }

    @Override
    public void moveUp() {
        pacman.translate(0, -20);
    }

    @Override
    public void moveDown() {
        pacman.translate(0, 20);
    }

}
