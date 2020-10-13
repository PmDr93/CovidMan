package org.academiadecodigo.graphics;

public interface GridPosition {

    // to create and control grid from MOVABLE objects;

    // Position control
    int getCol();
    int getRow();
    void setPosition(int col, int row);

    // Moving the object
    void moveInDirection(GridMovement direction, int distance);

    boolean equals(GridPosition position);

    // Color and pic control

}
