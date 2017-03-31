package org.academiadecodigo.roothless.input;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import org.academiadecodigo.roothless.gameObjects.Player;

/**
 * Created by codecadet on 30/03/17.
 */
public class InputListener implements InputProcessor {

    private Player player;

    public InputListener(Player player) {
        this.player = player;
    }

    @Override
    public boolean keyDown(int keycode) {



        if (keycode == Input.Keys.SPACE) {
            player.attack();
            return true;
        }

        if (!player.isInverted()) {
            return regularMovement(keycode);
        } else {
            return invertedMovement(keycode);
        }
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

    public boolean regularMovement(int keycode) {

        player.inverterSwitch();

        switch (keycode) {
            case Input.Keys.UP:
                //colision detection
                player.setPosY(player.getPosY() - 32);
                return true;

            case Input.Keys.DOWN:
                //colision detection
                player.setPosY(player.getPosY() + 32);
                return true;

            case Input.Keys.RIGHT:
                //colision detection
                player.setPosX(player.getPosX() + 32);
                return true;

            case Input.Keys.LEFT:
                //colision detection
                player.setPosX(player.getPosX() - 32);
                return true;

            default:
                return false;
        }
    }

    public boolean invertedMovement(int keycode) {

        player.inverterSwitch();

        switch (keycode) {
            case Input.Keys.UP:
                //colision detection
                player.setPosY(player.getPosY() + 32);
                return true;

            case Input.Keys.DOWN:
                //colision detection
                player.setPosX(player.getPosX() - 32);
                return true;

            case Input.Keys.RIGHT:
                //colision detection
                player.setPosY(player.getPosY() - 32);
                return true;

            case Input.Keys.LEFT:
                //colision detection
                player.setPosX(player.getPosX() + 32);
                return true;

            default:
                return false;

        }
    }
}
