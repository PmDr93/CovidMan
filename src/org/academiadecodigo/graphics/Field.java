package org.academiadecodigo.graphics;

import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Field implements Grid{
    private static final int PADDING = 10;
    private static final int CELL_SIZE = 25;
    @Override
    public void init() {
        Rectangle field = new Rectangle(PADDING, PADDING, 40*CELL_SIZE,25*CELL_SIZE);
        field.draw();
    }

    @Override
    public int getCols() {
        return 0;
    }

    @Override
    public int getRows() {
        return 0;
    }

    @Override
    public GridPosition makeGridPosition(int col, int row) {
        return null;
    }
}
