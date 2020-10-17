package org.academiadecodigo.graphics;

import org.academiadecodigo.MakeWords.MakeWords;
import org.academiadecodigo.Objects.Controllables.PacMan;
import org.academiadecodigo.Objects.GhostCovid;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Field implements Grid {
    private static final int PADDING = 10;
    private static final int CELL_SIZE = 25;
    private MakeWords words = new MakeWords();

    @Override
    public void init() {
        Rectangle field = new Rectangle(PADDING, PADDING, 40*CELL_SIZE,25*CELL_SIZE);
        field.setColor(Color.BLACK);
        field.fill();
        Rectangle fieldGame = new Rectangle(PADDING, 50, 40*CELL_SIZE, 20*CELL_SIZE);
        fieldGame.setColor(Color.WHITE);
        fieldGame.draw();
        words.draw();
        drawObstacles();
    }

    public void drawHearts(int col, int row) {
        Picture heart1 = new Picture(col, row, "resources/Hearth.png");
        heart1.draw();
        /*
        Picture heart2 = new Picture(50, 20, "resources/Hearth.png");
        heart2.draw();
        Picture heart3 = new Picture(80,80,"resources/Hearth.png");
        heart3.draw();
         */
    }

    public void countHearts(PacMan lives){
        int col = 20;
        int row = 20;
        for (int i = 0; i < lives.getLives(); i++){
            drawHearts(col,row);
            col += 30;
        }
    }

    public void drawObstacles(){
        Rectangle verticalWall = new Rectangle(235, 100,CELL_SIZE, CELL_SIZE*10);
        verticalWall.setColor(Color.BLUE);
        verticalWall.fill();

        Rectangle horizontalWall = new Rectangle(235,350, CELL_SIZE*10, CELL_SIZE);
        horizontalWall.setColor(Color.BLUE);
        horizontalWall.fill();
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

