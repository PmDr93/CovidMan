package org.academiadecodigo.Objects;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GhostCovid extends Characters{

    private Picture covid;
    private boolean dead;

    public GhostCovid (int col, int row) {
        covid = new Picture(col, row, "resources/NewCovid.png");
        covid.draw();
    }

    public void kill(){
        dead = true;
    }
}
