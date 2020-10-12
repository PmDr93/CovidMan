package org.academiadecodigo.Controls;

import org.academiadecodigo.Objects.Controllables.PacMan;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Controls implements KeyboardHandler{

    private Keyboard keyboard;
    private PacMan pacman;

    public void init() {
        // defines what each key does (movement)
        keyDown();
        keyLeft();
        keyRight();
        keyUp();



        keyboard = new Keyboard(this);

    }

    public void keyLeft(){
        KeyboardEvent leftPressed = new KeyboardEvent();
        leftPressed.setKey(KeyboardEvent.KEY_LEFT);
        leftPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(leftPressed);
    }
    public void keyRight() {
        KeyboardEvent rightPressed = new KeyboardEvent();
        rightPressed.setKey(KeyboardEvent.KEY_RIGHT);
        rightPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(rightPressed);
    }

     public void keyUp() {
         KeyboardEvent upPressed = new KeyboardEvent();
         upPressed.setKey(KeyboardEvent.KEY_UP);
         upPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

         keyboard.addEventListener(upPressed);
     }
    public void keyDown(){
        KeyboardEvent downPressed = new KeyboardEvent();
        downPressed.setKey(KeyboardEvent.KEY_DOWN);
        downPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(downPressed);
    }

    //Connects pacman's movements to the keys
    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if (keyboardEvent.getKey()==keyboardEvent.KEY_UP) {
            pacman.moveUp();
        } else if (keyboardEvent.getKey()==keyboardEvent.KEY_DOWN){
            pacman.moveDown();
        } else if (keyboardEvent.getKey()==keyboardEvent.KEY_LEFT){
            pacman.moveLeft();
        } else if (keyboardEvent.getKey()==keyboardEvent.KEY_RIGHT){
            pacman.moveRight();
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
