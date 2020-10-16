package org.academiadecodigo.Objects;

import org.academiadecodigo.Objects.Controllables.Controllable;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GhostCovid extends Characters implements Controllable {

    private Picture covid;
    private boolean dead;
    private int col;
    private int row;
    private int delay = 200;


    public GhostCovid (int col, int row) {
        this.col = col;
        this.row = row;
        covid = new Picture(col, row, "resources/NewCovid.png");
        covid.draw();
        moveInDirection();
    }

    public int getX() {
        return covid.getX();
    }

    public int getY() {
        return covid.getY();
    }


    public void kill(){
        dead = true;
    }



    public void moveInDirection() {
        //case 1 = up, case 2 = down, case 3 = left, case 4 = right

        while(!dead) {
            double random = Math.random();
            if (random < 0.25) {
                moveUp();
            } else if (random < 0.50) {
                moveLeft();
            } else if (random < 0.75) {
                moveRight();
            } else {
                moveDown();
            }
        }

    }

    public void randomMove() {
        moveUp();

    }


    @Override
    public void moveRight() {
        if (col >= 39*25) {
            covid.translate(0, 0);
        } else {
            covid.translate(25,0);
            col += 25;
        }
    }

    @Override
    public void moveLeft() {
        if (col <= 10) {
            covid.translate(0, 0);
        } else {
            covid.translate(-25, 0);
            col -= 25;
        }
    }

    @Override
    public void moveUp() {
        if (row <= 50) {
            covid.translate(0, 0);
        } else {
            covid.translate(0, -25);
            row -= 25;
        }

    }

    @Override
    public void moveDown() {
        if (row >= 21*25) {
            covid.translate(0, 0);
        } else {
            covid.translate(0, 25);
            row += 25;
        }

    }
}
