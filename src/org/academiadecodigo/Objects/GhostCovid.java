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

    public void removeFromField(){
        covid.delete();
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

    public boolean isDead(){
        return dead;
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
        covid.load("resources/CovidRight.png");
        if (col >= 39*25 || ((col >= 8*25 && col <= 10*25) && (row >= 4*25 && row <= 11*25)) //=======wall1
                || ((col >= 4*25 && col <= 6*25 && row >= 18*25 && row <= 18*25)) //=============wall4
                || (col >= 19*25 && col <= 21*25 && row >= 13*25 && row < 14*25) //=============wall5
                || (col <= 19*25 && col >= 18*25 && row >= 3*25 && row <= 7*25) ) {
            initialMove = Moves.LEFT;
        } else {
            covid.translate(25,0);
            col += 25;
        }
    }

    @Override
    public void moveLeft() {
        covid.load("resources/NewCovid.png");
        if (col <= 10 || ((col <= 11*25 && col >= 10*25) && (row >= 4*25 && row <= 11*25)) // ====== wall1
                || (col <= 6*25 &&  row == 6*25) || (col <= 6*25 &&  row == 14*25)  //==========wall2 & 3
                || ((col >= 25*25 && col <= 26*25 && row >= 18*25 && row <= 18*25)) // ====== wall4
                || (col >= 30*25 && col <= 40*25 && row >= 13*25 && row < 14*25 )  // ====== wall5
                || (col <= 21*25 && col >= 19*25 && row >= 3*25 && row <= 7*25)) {
            initialMove = Moves.RIGHT;
        } else {
            covid.translate(-25, 0);
            col -= 25;
        }
    }

    @Override
    public void moveUp() {
        covid.load("resources/CovidUp.png");
        if (row <= 50 || ((row <= 12*25 && row >= 4*25) && col == 235)   //==============wall1
                || (row == 7*25 && (col >= 0 && col <= 5*25) || (row == 15*25 && (col >= 0 && col <= 5*25))) //====== wall2 & 3
                || (row == 19*25 && (col >= 5*25 && col <= 25*25))  //==============wall4
                || (row >= 14*25 && row < 15*25 && col <= 39*25 && col >= 20*25 )  //===========wall5
                || (row >= 8*25 && row < 9*25 && col >= 19*25 && col < 20*25 )) {
            initialMove = Moves.DOWN;
        } else {
            covid.translate(0, -25);
            row -= 25;
        }

    }

    @Override
    public void moveDown() {
        covid.load("resources/CovidDown.png");
        if (row >= 21*25 || ((row >= 3*25 && row <= 7*25) && col == 235)   //=======wall1
                || (row == 5*25 && (col >= 0 && col <= 5*25)) || (row == 13*25 && (col >= 0 && col <= 5*25)) //==== wall2 & 3
                || (row == 17*25 && (col >= 5*25 && col <= 25*25)) //===========wall4
                || (row >= 12*25 && row < 13*25 && col <= 39*25 && col >= 20*25 ) //===========wall5
                || (row >= 2*25 && row < 8*25 && col >= 19*25 && col < 20*25 )) {
            initialMove = Moves.UP;
        } else {
            covid.translate(0, 25);
            row += 25;
        }

    }
}
