package org.academiadecodigo.Objects;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Syringe {

    private Picture syringePic;
    private boolean used;

    public Syringe() {
        syringePic = new Picture(775, 450, "resources/syringe.png");
        syringePic.draw();
    }

    public void isUsed(){
        used = true;
    }

    public void useSyring(GhostCovid ghost){
        if(!used){
            ghost.kill(); // falta definir metodo kill na class
            isUsed();
        }
    }
}
