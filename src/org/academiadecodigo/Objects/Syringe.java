package org.academiadecodigo.Objects;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Syringe {

    private Picture syringePic;
    private boolean isUsed = false;


    public Syringe() {
        syringePic = new Picture(10, 250, "resources/Syringe.png");
        syringePic.draw();
    }

    public int getX() {
        return syringePic.getX();
    }

    public int getY() {
        return syringePic.getY();
    }

    public boolean getIsUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    public void remove() {
        syringePic.delete();
    }
}
