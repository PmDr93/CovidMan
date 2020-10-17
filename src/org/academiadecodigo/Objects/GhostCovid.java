package org.academiadecodigo.Objects;

import org.academiadecodigo.Objects.Controllables.Controllable;
import org.academiadecodigo.Objects.Controllables.Moves;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GhostCovid extends Characters implements Controllable {

    private Picture covid;
    private boolean dead;
    private int col;
    private int row;
    private int delay = 200;
    private Moves initialMove;


    public GhostCovid (int col, int row) throws InterruptedException {
        this.col = col;
        this.row = row;
        covid = new Picture(col, row, "resources/NewCovid.png");
        covid.draw();
        initialMove = Moves.values()[(int) Math.floor(Math.random()*4)];
        //moveInDirection();
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

    public double randomizer(){
        return Math.random();
}

    public void moveInDirection() throws InterruptedException {
        //case 1 = up, case 2 = down, case 3 = left, case 4 = right
        
            Thread.sleep(50);
            while (randomizer() < 0.8) {
               setInitialMove();
            }

            if (dead){
                covid.delete();
            }
    }

    public void setInitialMove() {
        int random = (int) Math.floor(Math.random()*4);
        /*
        switch (random){
           case 0: moveRight();
           return Moves.RIGHT;

           case 1: moveLeft();
           return Moves.LEFT;

           case 2: moveUp();
           return Moves.UP;

           case 3: moveDown();
           return Moves.DOWN;

        }

         */

        if(random<2){
            moveRight();
        } else moveLeft();
    }


    @Override
    public void moveRight() {
        if (col >= 39*25) {
            covid.translate(0, 0);
            moveLeft();
        } else {
            covid.translate(25,0);
            col += 25;
        }
    }

    @Override
    public void moveLeft() {
        if (col <= 10) {
            covid.translate(0, 0);
            moveRight();
        } else {
            covid.translate(-25, 0);
            col -= 25;
        }
    }

    @Override
    public void moveUp() {
        if (row <= 50) {
            covid.translate(0, 0);
            moveDown();
        } else {
            covid.translate(0, -25);
            row -= 25;
        }

    }

    @Override
    public void moveDown() {
        if (row >= 21*25) {
            covid.translate(0, 0);
            moveUp();
        } else {
            covid.translate(0, 25);
            row += 25;
        }

    }
}
