package org.academiadecodigo.Objects;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GhostCovid extends Characters{

    private Picture picture;
    private boolean dead;

    public void kill(){
        dead = true;
    }
}
