package org.academiadecodigo.Objects;

import org.academiadecodigo.graphics.GridMovement;
import org.academiadecodigo.graphics.GridPosition;

public class Characters extends GameObjects implements GridPosition {

    protected int lives = 3;
    private boolean dead;
    private boolean resetCovid;


    public boolean isDead() {
        return dead;
    }

    public int getLives() {
        return Lives;
    }

    public void setLives(int lives) {
        Lives = lives;
    }

    // used for virus movement
    @Override
    public int getCol() {
        return 0;
    }

    @Override
    public int getRow() {
        return 0;
    }

    @Override
    public void setPosition(int col, int row) {

    }

    @Override
    public void moveInDirection(GridMovement direction, int distance) {
    }

    public void moveUp() {

    }

    @Override
    public boolean equals(GridPosition position) {
        return false;
    }
}
