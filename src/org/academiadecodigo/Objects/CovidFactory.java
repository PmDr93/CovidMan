package org.academiadecodigo.Objects;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class CovidFactory {

    private int numberCovid = 3;
    private GhostCovid[] covids = new GhostCovid[numberCovid];
    private Picture covid;
    protected int col = 918;
    protected int row = 500;


    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public GhostCovid[] covidFactory() throws InterruptedException {

        for (int i = 0; i < numberCovid; i++) {
            covids[i] = new GhostCovid(col, row);
            col += 50;
        }
        return covids;
    }


}
