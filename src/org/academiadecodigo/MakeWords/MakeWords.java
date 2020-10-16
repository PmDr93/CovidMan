package org.academiadecodigo.MakeWords;

import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.awt.*;

public class MakeWords {

    //words: CODIGO, ACADEMIA,BOOTCAMP
    private Picture picture;
    Picture[] codigo = new Picture[] {
            new Picture(600,400,"resources/Letters/letter_green_A.png"),
            new Picture(50,200,"resources/Letters/letter_green_C.png"),
            new Picture(900,50,"resources/Letters/letter_green_A.png"),
            new Picture(100,300,"resources/Letters/letter_green_D.png"),
            new Picture(800,375,"resources/Letters/letter_green_E.png"),
            new Picture(90,250,"resources/Letters/letter_green_M.png"),
            new Picture(200,450,"resources/Letters/letter_green_I.png"),
            new Picture(500,50,"resources/Letters/letter_green_A.png")
    };

    public void draw(){
        for (int i = 0; i < codigo.length; i++) {
            codigo[i].draw();
        }
    }


}
