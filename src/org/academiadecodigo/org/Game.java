package org.academiadecodigo.org;

import org.academiadecodigo.Objects.Characters;
import org.academiadecodigo.graphics.Field;

public class Game {

    private Field field;
    private Characters characters;
    private int score;

    public void start() {
        field.init();
    }
}
