package org.academiadecodigo.roothless.gameObjects;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by codecadet on 30/03/17.
 */
public class Player {

    private int healthPoints;
    private int attack;
    private TextureRegion textureRegion;
    private static final int PLAYER_MOVEMENT = 32;
    private Vector2 position;

    public Player() {
        healthPoints = 5;
        attack = 1;

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
