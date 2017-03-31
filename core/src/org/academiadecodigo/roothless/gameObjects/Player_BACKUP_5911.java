package org.academiadecodigo.roothless.gameObjects;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by codecadet on 30/03/17.
 */
public class Player {

    private int healthPoints;
    private int attack;
<<<<<<< HEAD
=======
    private TextureRegion textureRegion;
    private static final int PLAYER_MOVEMENT = 32;
>>>>>>> 28e65b766a2aaf0212e2dce29ccad2a7b2e67ebd
    private Vector2 position;
    private int width;
    private int height;
    private boolean isAlive;

    public Player(float x, float y) {
        healthPoints = 5;
        attack = 1;
        position = new Vector2(x, y);
        isAlive = true;

    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public boolean isAlive() {
        return isAlive;
    }


    public void dead(){
        isAlive = false;
    }

    public float getX() {
        return position.x;
    }

    public float getY() {
        return position.y;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }
}
