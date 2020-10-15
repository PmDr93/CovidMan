package org.academiadecodigo.Objects;

public class CovidFactory {

    private int numberCovid = 2;
    GhostCovid covid;
    int col = 100;
    int row = 500;

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public void covidFactory() {

        for (int i = 0; i < numberCovid; i++) {
            covid = new GhostCovid();
            col += 50;
        }
    }
}
