package org.academiadecodigo.graphics;

import org.academiadecodigo.MakeWords.MakeWords;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Field implements Grid{
    private static final int PADDING = 10;
    private static final int CELL_SIZE = 25;


    public void wordDisposition() {

    }

    @Override
    public void init() {
        Rectangle field = new Rectangle(PADDING, PADDING, 40*CELL_SIZE,25*CELL_SIZE);
        wordDisposition();
        field.setColor(Color.BLACK);
        field.fill();
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
