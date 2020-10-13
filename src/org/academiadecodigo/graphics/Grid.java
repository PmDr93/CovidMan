package org.academiadecodigo.graphics;

public interface Grid {

    // to create and initialize background;

    void init();

    int getCols();
    int getRows();

    GridPosition makeGridPosition(int col, int row);
}
