package org.academiadecodigo.Objects;

public class CovidFactory {

    private int numberCovid = 5;
    GhostCovid covid;
    int col = 200;
    int row = 250;

    public void covidFactory() {

        for (int i = 0; i < numberCovid; i++) {
            covid = new GhostCovid(col, row);
            col += 50;
        }
    }
}
