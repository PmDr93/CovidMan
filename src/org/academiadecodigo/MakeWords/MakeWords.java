package org.academiadecodigo.MakeWords;

import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.awt.*;

public class MakeWords {

    //words: CODIGO, ACADEMIA,BOOTCAMP
    private Picture picture;
    private Picture codigoLetter;


    private Picture[] codigo = new Picture[] {

            new Picture( 890,52,"resources/Letters/letterA.png"),
            new Picture(40,200,"resources/Letters/letterC.png"),
            new Picture(835,450,"resources/Letters/letterA.png"),
            new Picture(360,498,"resources/Letters/letterD.png"),
            new Picture(690,125,"resources/Letters/letterE.png"),
            new Picture(285,100,"resources/Letters/letterM.png"),
            new Picture(490,250,"resources/Letters/letterI.png"),
            new Picture(12,475,"resources/Letters/letterA.png"),
    };

    private Picture[] codigoDown = new Picture[] {

            new Picture( 20,560,"resources/Letters/letterA.png"),
            new Picture(50,560,"resources/Letters/letterC.png"),
            new Picture(80,560,"resources/Letters/letterA.png"),
            new Picture(110,560,"resources/Letters/letterD.png"),
            new Picture(140,560,"resources/Letters/letterE.png"),
            new Picture(170,560,"resources/Letters/letterM.png"),
            new Picture(200,560,"resources/Letters/letterI.png"),
            new Picture(230,560,"resources/Letters/letterA.png"),
    };

    public Picture[] getCodigo() {
        return codigo;
    }

    public Picture[] getCodigoDown() {
        return codigoDown;
    }

    public void draw(){
        for (int i = 0; i < codigo.length; i++) {
            codigo[i].draw();
        }
    }

    public void drawDown() {
        for (int i = 0; i < codigoDown.length; i++) {
            codigoDown[i].draw();
        }

    }











}
