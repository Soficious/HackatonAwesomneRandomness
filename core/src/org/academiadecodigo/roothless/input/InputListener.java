package org.academiadecodigo.roothless.input;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;

/**
 * Created by codecadet on 30/03/17.
 */
public class InputListener implements InputProcessor {

    @Override
    public boolean keyDown(int keycode) {

        switch (keycode) {
            case Input.Keys.UP:
                //colision detection
                //movement
                break;

            case Input.Keys.DOWN:
                //colision detection
                //movement
                break;

            case Input.Keys.RIGHT:
                //colision detection
                //movement
                break;

            case Input.Keys.LEFT:
                //colision detection
                //movement
                break;

            case Input.Keys.SPACE:
                //colision detection
                //attack
                break;

        }
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
