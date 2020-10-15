package org.academiadecodigo.Objects;

import org.academiadecodigo.graphics.GridMovement;
import org.academiadecodigo.graphics.GridPosition;

public class Characters extends GameObjects {

    protected int lives = 3;
    private boolean dead;
    private boolean resetCovid;


    public boolean isDead() {
        return dead;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        lives = lives;
    }

    // used for virus movement

}
