package org.academiadecodigo.Objects;

import org.academiadecodigo.Objects.Controllables.Controllable;
import org.academiadecodigo.Objects.Controllables.Moves;
import org.academiadecodigo.Objects.Controllables.PacMan;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GhostCovid extends Characters implements Controllable {

    private Picture covid;
    private PacMan pac;
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
        covid.delete();
    }

    public double randomizer(){
        return Math.random();
}

    public void moveInDirection() throws InterruptedException {
        //case 1 = up, case 2 = down, case 3 = left, case 4 = right
        /*
            Thread.sleep(50);
            if (randomizer() > 0.8) {
               setInitialMove();
            }

            if (dead){
                covid.delete();
            }

         */

        int rand = (int) Math.floor(Math.random()*100);

        if(rand <30) {
            setInitialMove();
        }
        if(!dead) {
            Thread.sleep(50);
            switch (initialMove) {
                case RIGHT: moveRight(); break;
                case DOWN: moveDown(); break;
                case UP: moveUp(); break;
                case LEFT: moveLeft(); break;
            }
        }
    }

    public Moves setInitialMove() {
        int rand = (int) Math.floor(Math.random()*Moves.values().length);
        return initialMove = Moves.values()[rand];

    }


    @Override
    public void moveRight() {
        if (col >= 39*25) {
            initialMove = Moves.LEFT;
        } else {
            covid.translate(25,0);
            col += 25;
        }
    }

    @Override
    public void moveLeft() {
        if (col <= 10) {
            initialMove = Moves.RIGHT;
        } else {
            covid.translate(-25, 0);
            col -= 25;
        }
    }

    @Override
    public void moveUp() {
        if (row <= 50) {
            initialMove = Moves.DOWN;
        } else {
            covid.translate(0, -25);
            row -= 25;
        }

    }

    @Override
    public void moveDown() {
        if (row >= 21*25) {
            initialMove = Moves.UP;
        } else {
            covid.translate(0, 25);
            row += 25;
        }

    }
}
