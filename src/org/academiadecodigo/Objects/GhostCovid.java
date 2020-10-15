package org.academiadecodigo.Objects;

import org.academiadecodigo.Objects.Controllables.Controllable;
import org.academiadecodigo.graphics.GridMovement;
import org.academiadecodigo.graphics.GridPosition;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GhostCovid extends Characters implements Controllable {

    private Picture covid;
    private boolean dead;
    private int col = 100;
    private int row = 500;

    public GhostCovid () {
        covid = new Picture(col, row, "resources/NewCovid.png");
        covid.draw();
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public void kill(){
        dead = true;
    }


    public void moveInDirection() {
        //case 1 = up, case 2 = down, case 3 = left, case 4 = right
        int random = (int) Math.ceil(Math.random() * 4);

        switch (random) {
            case 1:
                moveUp();
            case 2:
                moveDown();
            case 3:
                moveLeft();
            case 4:
                moveRight();
        }

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
