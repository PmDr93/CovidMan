package org.academiadecodigo.Objects.Controllables;

import org.academiadecodigo.Objects.Characters;
import org.academiadecodigo.Objects.GhostCovid;
import org.academiadecodigo.org.Game;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.Objects.Syringe;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class PacMan extends Characters implements Controllable {

    private int col = 10;
    private int row = 50;
    private boolean dead;
    private GhostCovid covid;
    private Picture pacman;
    private Syringe syringe;
    private boolean hasSyringe;
    //private Game test;

    public PacMan(){
        //test = game;
        this.pacman = new Picture(col,row,"resources/PixelArt.png");
        this.pacman.draw();
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getCol() {
        return col;
    }

    public int getX() {
        return pacman.getX();
    }

    public int getY() {
        return pacman.getY();
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public void setSyringe(Syringe syringe) {
        this.syringe = syringe;
    }

    public void setCovid(GhostCovid covid) {
        this.covid = covid;
    }


    public void loseLife() {
        if (isDead()) {
            this.lives --;
        }
    }

    //use syringe
    public void syringeUsed() {

        if (pacman.getY() == syringe.getY() && pacman.getX() == syringe.getX()) {
            syringe.setUsed(true);
            hasSyringe = true;
            syringe.remove();
            //killCovid();
        }
    }

    //when pac touch ghost lose life

    public void deadByGhost(GhostCovid[] covids) {
        for(GhostCovid ghost: covids) {
            if (pacman.getX() == ghost.getX() && pacman.getY() == ghost.getY() && hasSyringe == false && ghost.isDead()==false) {
                setDead(true);
                lives--;
                pacman.delete();
            }
        }
    }

    public void killCovid(GhostCovid[] covids) {
        for (GhostCovid ghost: covids) {
            if (hasSyringe == true) {
                if (pacman.getX() == ghost.getX() && pacman.getY() == ghost.getY()) {
                    ghost.kill();
                    hasSyringe = false;
                }
            }
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
