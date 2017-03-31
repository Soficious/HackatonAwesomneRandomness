package org.academiadecodigo.roothless.gameObjects;


import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by codecadet on 30/03/17.
 */
public class Player extends Sprite {

    private int healthPoints;
    private int attack;
    private static final int PLAYER_MOVEMENT = 32;
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



}
