package org.academiadecodigo.Objects;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class CovidFactory {

    private int numberCovid = 1;
    private GhostCovid covids;
    private Picture covid;
    protected int col = 300;
    protected int row = 500;


    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public void covidFactory() {

        for (int i = 0; i < numberCovid; i++) {
            covids = new GhostCovid(col, row);
            col += 50;

        }
    }


}
