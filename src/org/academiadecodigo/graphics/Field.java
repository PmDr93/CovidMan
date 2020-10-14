package org.academiadecodigo.graphics;

import org.academiadecodigo.MakeWords.MakeWords;
import org.academiadecodigo.Objects.Controllables.PacMan;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Field implements Grid {
    private static final int PADDING = 10;
    private static final int CELL_SIZE = 25;
    private PacMan pac;


    @Override
    public void init() {
        Rectangle field = new Rectangle(PADDING, PADDING, 40*CELL_SIZE,25*CELL_SIZE);
        field.setColor(Color.BLACK);
        field.fill();
        Rectangle fieldGame = new Rectangle(PADDING, 50, 40*CELL_SIZE, 20*CELL_SIZE);
        fieldGame.setColor(Color.WHITE);
        fieldGame.draw();
        hearts();
    }

    public void hearts() {
        Picture heart1 = new Picture(20, 20, "resources/Hearth.png");
        heart1.draw();
        Picture heart2 = new Picture(50, 20, "resources/Hearth.png");
        heart2.draw();

        if (pac.isDead())

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

