package org.academiadecodigo.graphics;

import com.sun.tools.jconsole.JConsoleContext;

public enum GridMovement {

    UP,
    DOWN,
    LEFT,
    RIGHT;

    // Checks if two directions are opposites
    public boolean isOpposite(GridMovement dir) {
        return dir.equals(oppositeDirection());
    }

    // Obtains the opposite direction
    public GridMovement oppositeDirection() {

        GridMovement opposite = null;

        switch (this) {
            case UP:
                opposite = GridMovement.DOWN;
                break;
            case DOWN:
                opposite = GridMovement.UP;
                break;
            case LEFT:
                opposite = GridMovement.RIGHT;
                break;
            case RIGHT:
                opposite = GridMovement.LEFT;
                break;
        }

        return opposite;
    }
}
