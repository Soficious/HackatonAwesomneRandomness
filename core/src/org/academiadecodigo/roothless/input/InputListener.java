package org.academiadecodigo.roothless.input;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import org.academiadecodigo.roothless.gameObjects.Enemy;
import org.academiadecodigo.roothless.gameObjects.Player;
import org.academiadecodigo.roothless.loader.AssetLoader;

import java.util.ArrayList;

/**
 * Created by codecadet on 30/03/17.
 */
public class InputListener implements InputProcessor {

    private Player player;
    private ArrayList<Enemy> enemyList;

    public InputListener(Player player, ArrayList<Enemy> enemyList) {
        this.player = player;
        this.enemyList = enemyList;;
    }

    @Override
    public boolean keyDown(int keycode) {


        if (keycode == Input.Keys.SPACE) {
            player.attack();
            return true;
        }

        if (!player.isInverted()) {
            enemyMove();
            return regularMovement(keycode);
        } else {
            enemyMove();
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
                alternateFront();
                player.setPosY(player.getPosY() - 32);
                System.out.println("going up normal");
                return true;

            case Input.Keys.DOWN:
                //colision detection
                alternateBack();
                player.setPosY(player.getPosY() + 32);
                return true;

            case Input.Keys.RIGHT:
                //colision detection
                alternateRight();
                player.setPosX(player.getPosX() + 32);
                return true;

            case Input.Keys.LEFT:
                //colision detection
                alternateLeft();
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
                alternateBack();
                player.setPosY(player.getPosY() + 32);
                return true;

            case Input.Keys.DOWN:
                //colision detection
                alternateLeft();
                player.setPosX(player.getPosX() - 32);
                return true;

            case Input.Keys.RIGHT:
                //colision detection
                alternateFront();
                player.setPosY(player.getPosY() - 32);
                return true;

            case Input.Keys.LEFT:
                //colision detection
                alternateRight();
                player.setPosX(player.getPosX() + 32);
                return true;

            default:
                return false;

        }
    }

    public void alternateRight() {
        if (!player.isAnimationSwitch()) {
            player.setTextureRegion(AssetLoader.right1);
            player.setAnimationSwitch(true);
        } else {
            player.setTextureRegion(AssetLoader.right2);
            player.setAnimationSwitch(false);
        }
    }

    public void alternateLeft() {

        if (!player.isAnimationSwitch()) {
            player.setTextureRegion(AssetLoader.left1);
            player.setAnimationSwitch(true);
        } else {
            player.setTextureRegion(AssetLoader.left2);
            player.setAnimationSwitch(false);
        }

    }

    public void alternateFront() {

        if (!player.isAnimationSwitch()) {
            player.setTextureRegion(AssetLoader.front1);
            player.setAnimationSwitch(true);
        } else {
            player.setTextureRegion(AssetLoader.front2);
            player.setAnimationSwitch(false);
        }

    }

    public void alternateBack() {

        if (!player.isAnimationSwitch()) {
            player.setTextureRegion(AssetLoader.back1);
            player.setAnimationSwitch(true);
        } else {
            player.setTextureRegion(AssetLoader.back2);
            player.setAnimationSwitch(false);
        }
    }

    public void enemyMove() {
        for (Enemy e : enemyList) {
            e.enemyMovement();
        }
    }

}
