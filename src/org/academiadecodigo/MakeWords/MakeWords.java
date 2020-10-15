package org.academiadecodigo.MakeWords;

import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.awt.*;

public class MakeWords {

    //words: CODIGO, ACADEMIA,BOOTCAMP
    private Picture picture;
    Picture[] codigo = new Picture[8];



    public void draw() {
        codigo[0] = new Picture(600,400,"resources/Letters/letter_green_A.png");
        codigo[0].draw();
        codigo[1] = new Picture(50,200,"resources/Letters/letter_green_C.png");
        codigo[1].draw();

        codigo[2] = new Picture(900,50,"resources/Letters/letter_green_A.png");
        codigo[2].draw();
        codigo[3] = new Picture(100,300,"resources/Letters/letter_green_D.png");
        codigo[3].draw();

        codigo[4] = new Picture(800,375,"resources/Letters/letter_green_E.png");
        codigo[4].draw();
        codigo[5] = new Picture(90,250,"resources/Letters/letter_green_M.png");
        codigo[5].draw();

        codigo[6] = new Picture(200,450,"resources/Letters/letter_green_I.png");
        codigo[6].draw();
        codigo[7] = new Picture(500,50,"resources/Letters/letter_green_A.png");
        codigo[7].draw();


        }

    }
