package org.academiadecodigo.org;

import org.academiadecodigo.Objects.Characters;
import org.academiadecodigo.Objects.Controllables.PacMan;
import org.academiadecodigo.graphics.Field;

public class Game {

    private Field field;
    private Characters characters;
    private int score;
    private PacMan pacMan;

    public void start() {
        field.init();
        pacMan = new PacMan();
        field.countHearts(pacMan);
    }




}
