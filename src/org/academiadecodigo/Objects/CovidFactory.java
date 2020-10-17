package org.academiadecodigo.Objects;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class CovidFactory {

    private int numberCovid = 10;
    private GhostCovid[] covids = new GhostCovid[numberCovid];
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

        for (int i = 0; i < numberCovid; i++) {
            int randCol = ((int) Math.floor(Math.random()*910));
            int randRow = ((int) Math.floor(Math.random()*500));

            while(randCol % 25 != 0){
                randCol = ((int) Math.floor(Math.random()*910));
            }
            if(randCol % 25 == 0){
                col = randCol;
                System.out.println(" col "+col);
            }

            while(randRow % 25 != 0){
                randRow = ((int) Math.floor(Math.random()*500));
            }
            if (randRow % 25 == 0){
                row = randRow;
                System.out.println("row "+row);
            }
            covids[i] = new GhostCovid(col,row);
            covids[i].setInitialMove();
            col += 50;
        }
        return covids;
    }


}
