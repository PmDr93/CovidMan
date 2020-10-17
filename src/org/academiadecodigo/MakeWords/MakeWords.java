package org.academiadecodigo.MakeWords;

import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.awt.*;

public class MakeWords {

    //words: CODIGO, ACADEMIA,BOOTCAMP
    private Picture picture;
    Picture[] codigo = new Picture[] {

            new Picture(950,122,"resources/Letters/letterA.png"),
            new Picture(12,200,"resources/Letters/letterC.png"),
            new Picture(775,375,"resources/Letters/letterA.png"),
            new Picture(275,400,"resources/Letters/letterD.png"),
            new Picture(825,125,"resources/Letters/letterE.png"),
            new Picture(460,55,"resources/Letters/letterM.png"),
            new Picture(400,300,"resources/Letters/letterI.png"),
            new Picture(12,400,"resources/Letters/letterA.png"),
    };

    public void draw(){
        for (int i = 0; i < codigo.length; i++) {
            codigo[i].draw();
        }
    }


}
