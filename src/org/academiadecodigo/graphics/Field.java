package org.academiadecodigo.graphics;

import org.academiadecodigo.MakeWords.MakeWords;
import org.academiadecodigo.Objects.Controllables.PacMan;
import org.academiadecodigo.Objects.GhostCovid;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.graphics.Line;
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

        Rectangle verticalWall1 = new Rectangle(235, 77,CELL_SIZE, CELL_SIZE*7);
        verticalWall1.setColor(Color.BLUE);
        verticalWall1.fill();

        Rectangle verticalWall2 = new Rectangle(490, 51,CELL_SIZE, CELL_SIZE*5);
        verticalWall2.setColor(Color.BLUE);
        verticalWall2.fill();

        Rectangle verticalWall3 = new Rectangle(690, 350,CELL_SIZE, CELL_SIZE*8);
        verticalWall3.setColor(Color.BLUE);
        verticalWall3.fill();

        Rectangle verticalWall4 = new Rectangle(235, 350,CELL_SIZE, CELL_SIZE*5);
        verticalWall4.setColor(Color.BLUE);
        verticalWall4.fill();

        Rectangle verticalWall5 = new Rectangle(360, 150,CELL_SIZE, CELL_SIZE*9);
        verticalWall5.setColor(Color.BLUE);
        verticalWall5.fill();

        Rectangle verticalWall6 = new Rectangle(865, 350,CELL_SIZE, CELL_SIZE*6);
        verticalWall6.setColor(Color.BLUE);
        verticalWall6.fill();

        Rectangle verticalWall7 = new Rectangle(590, 102,CELL_SIZE, CELL_SIZE*6);
        verticalWall7.setColor(Color.BLUE);
        verticalWall7.fill();

        Rectangle verticalWall8 = new Rectangle(865, 250,CELL_SIZE, CELL_SIZE*4);
        verticalWall8.setColor(Color.BLUE);
        verticalWall8.fill();

        Rectangle verticalWall9 = new Rectangle(865, 75,CELL_SIZE, CELL_SIZE*4);
        verticalWall9.setColor(Color.BLUE);
        verticalWall9.fill();

//Horizontal Walls

        Rectangle horizontalWall1 = new Rectangle(12,150, CELL_SIZE*5, CELL_SIZE);
        horizontalWall1.setColor(Color.BLUE);
        horizontalWall1.fill();

        Rectangle horizontalWall2 = new Rectangle(120,450, CELL_SIZE*20, CELL_SIZE);
        horizontalWall2.setColor(Color.BLUE);
        horizontalWall2.fill();

        Rectangle horizontalWall3 = new Rectangle(235,350, CELL_SIZE*5, CELL_SIZE);
        horizontalWall3.setColor(Color.BLUE);
        horizontalWall3.fill();

        Rectangle horizontalWall4 = new Rectangle(85,252, CELL_SIZE*7, CELL_SIZE);
        horizontalWall4.setColor(Color.BLUE);
        horizontalWall4.fill();

        Rectangle horizontalWall5 = new Rectangle(490,350, CELL_SIZE*19, CELL_SIZE);
        horizontalWall5.setColor(Color.BLUE);
        horizontalWall5.fill();

        Rectangle horizontalWall6 = new Rectangle(385,252, CELL_SIZE*13, CELL_SIZE);
        horizontalWall6.setColor(Color.BLUE);
        horizontalWall6.fill();

        Rectangle horizontalWall7 = new Rectangle(710,150, CELL_SIZE*12, CELL_SIZE);
        horizontalWall7.setColor(Color.BLUE);
        horizontalWall7.fill();

        Rectangle horizontalWall8 = new Rectangle(12,350, CELL_SIZE*5, CELL_SIZE);
        horizontalWall8.setColor(Color.BLUE);
        horizontalWall8.fill();
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

