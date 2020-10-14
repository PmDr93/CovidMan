package org.academiadecodigo.Objects;

import org.academiadecodigo.graphics.GridMovement;
import org.academiadecodigo.graphics.GridPosition;

public class Characters extends GameObjects implements GridPosition {

    private int numberLives = 3;
    private boolean dead;
    private boolean resetCovid;


    public boolean isDead() {
        return dead;
    }


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

    @Override
    public boolean equals(GridPosition position) {
        return false;
    }
}
