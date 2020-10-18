package org.academiadecodigo.graphics;

import org.academiadecodigo.MakeWords.MakeWords;
import org.academiadecodigo.Objects.Characters;
import org.academiadecodigo.Objects.Controllables.PacMan;
import org.academiadecodigo.Objects.GhostCovid;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Field implements Grid {
    private static final int PADDING = 10;
    private static final int CELL_SIZE = 25;
    private Rectangle field;
    private Rectangle fieldGame;


    @Override
    public void init() {
        field = new Rectangle(PADDING, PADDING, 40*CELL_SIZE,25*CELL_SIZE);
        field.setColor(Color.BLACK);
        field.fill();
        fieldGame = new Rectangle(PADDING, 50, 40*CELL_SIZE, 20*CELL_SIZE);
        fieldGame.setColor(Color.WHITE);
        fieldGame.draw();
        fill();

    }

    public void endGame(){
        field.delete();
        fieldGame.delete();

    }


    Rectangle[] obstacles = new Rectangle[]{
            new Rectangle(235, 100, CELL_SIZE, CELL_SIZE*8), //============wall1
            new Rectangle(10,150, 5*CELL_SIZE, CELL_SIZE ),   //============wall2
            new Rectangle(10, 350, 5*CELL_SIZE, CELL_SIZE),   //============wall3
            new Rectangle(135,450, 20*CELL_SIZE, CELL_SIZE ),  ////============wall4
            new Rectangle(510, 325, 19*CELL_SIZE , CELL_SIZE), //==========wall5
            new Rectangle(485, 75, CELL_SIZE , CELL_SIZE*5)      //==========wall6
    };

    public Rectangle[] getObstacles() {
        return obstacles;
    }

    public void fill() {
        for (int i = 0; i < obstacles.length; i++) {
            obstacles[i].setColor(Color.BLUE);
            obstacles[i].fill();
        }

        //Rectangle horizontalWall = new Rectangle(235,350, CELL_SIZE*10, CELL_SIZE);
        //horizontalWall.setColor(Color.BLUE);
        //horizontalWall.fill();
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

