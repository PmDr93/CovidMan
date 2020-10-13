package org.academiadecodigo.org;

import org.academiadecodigo.Objects.Controllables.PacMan;
import org.academiadecodigo.graphics.Field;

public class Main {

    public static void main(String[] args) {
        Field field = new Field();
        field.init();

        PacMan pacMan = new PacMan();

        pacMan.moveRight();
        pacMan.moveRight();
        pacMan.moveLeft();

         
    }
}
