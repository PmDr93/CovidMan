package org.academiadecodigo.Objects;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class CovidFactory {

    private int numberCovid = 5;
    private GhostCovid[] covids= new GhostCovid[numberCovid];
    private Picture covid;
    protected int col = 910;
    protected int row = 500;


    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public GhostCovid[] covidFactory() throws InterruptedException {

        for (int i = 0; i < covids.length; i++) {
            covids[i] = new GhostCovid(col, row);

        }
        return covids;
    }


}
