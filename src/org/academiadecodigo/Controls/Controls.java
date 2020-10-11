package org.academiadecodigo.Controls;

import org.academiadecodigo.Objects.PacMan;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Controls implements KeyboardHandler{

    private Keyboard keyboard;
    private PacMan pacman;

    public void init() {
        keyboard = new Keyboard(this);
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {


    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
