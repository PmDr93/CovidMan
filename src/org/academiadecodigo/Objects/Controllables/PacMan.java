package org.academiadecodigo.Objects.Controllables;

import org.academiadecodigo.Objects.Characters;
import org.academiadecodigo.Objects.GhostCovid;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class PacMan extends Characters implements Controllable {

    private int col = 10;
    private int row = 50;
    private GhostCovid covid;
    private Picture pacman;

    public PacMan(){
        this.pacman = new Picture(col,row,"resources/PixelArt.png");
        this.pacman.draw();
    }


    public void loseLife() {
        if (isDead()) {
            lives --;
        }
    }

    //when pac touch ghost lose life

    public void deadByGhost() {
        if (pacman.getX() == covid.getX() && pacman.getY() == covid.getY()) {
            loseLife();
        }
    }



    // movement and boundaries of pac man

    @Override
    public void moveRight() {
        pacman.load("resources/PixelArt.png");
        if (col >= 39*25) {
            pacman.translate(0, 0);
        } else {
            pacman.translate(25, 0);
            col += 25;
        }
    }

    @Override
    public void moveLeft() {
        pacman.load("resources/PacLeft.png");

        if (col <= 10) {
            pacman.translate(0, 0);
        } else {
            pacman.translate(-25, 0);
            col -= 25;
        }

    }

    @Override
    public void moveUp() {
        pacman.load("resources/PacUp.png");
        if (row <= 50) {
            pacman.translate(0, 0);
        } else {
            pacman.translate(0, -25);
            row -= 25;
        }
    }

    @Override
    public void moveDown() {
        pacman.load("resources/PacDown.png");
        if (row >= 21*25) {
            pacman.translate(0, 0);
        } else {
            pacman.translate(0, 25);
            row += 25;
        }
    }

}
