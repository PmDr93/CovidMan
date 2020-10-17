package org.academiadecodigo.Objects;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class CovidFactory {

    private int numberCovid = 2;
    private GhostCovid covids;
    private Picture covid;
    protected int col = 910;
    protected int row = 500;


    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public void covidFactory() throws InterruptedException {

        for (int i = 0; i < numberCovid; i++) {
            covids = new GhostCovid(col, row);
            col += 50;
            covids.moveInDirection();
        }
    }


}
