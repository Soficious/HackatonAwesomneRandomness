package org.academiadecodigo.roothless.gameObjects;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;
import org.academiadecodigo.roothless.util.RNG;

/**
 * Created by codecadet on 30/03/17.
 */
public class Player extends Actor{

    private int healthPoints;
    private int attack;
    private TextureRegion textureRegion;
    private static final int PLAYER_MOVEMENT = 32;
    private Rectangle hitbox;
    private int posX;
    private int posY;
    private boolean inverted;
    private int moveCounter;
    private int pityCounter;
    private boolean alive = true;


    public Player(int posX, int posY) {
        healthPoints = 5;
        attack = 1;
        this.posX = posX;
        this.posY = posY;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
    public Rectangle getHitbox() {
        return hitbox;
    }

    public void setHitbox(Rectangle hitbox) {
        this.hitbox = hitbox;
    }

    public TextureRegion getTextureRegion() {
        return textureRegion;
    }

    public void setTextureRegion(TextureRegion textureRegion) {
        this.textureRegion = textureRegion;
    }

    public static int getPlayerMovement() {
        return PLAYER_MOVEMENT;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public boolean isInverted() {
        return inverted;
    }

    public void setInverted(boolean inverted) {
        this.inverted = inverted;
    }

    public int getMoveCounter() {
        return moveCounter;
    }

    public void setMoveCounter(int moveCounter) {
        this.moveCounter = moveCounter;
    }

    public int getPityCounter() {
        return pityCounter;
    }

    public void setPityCounter(int pityCounter) {
        this.pityCounter = pityCounter;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void attack() {}

    public void inverterSwitch () {
        if (moveCounter>= RNG.movePityCounter()) {
            moveCounter= 0;
            inverted = true;
        } else {
            moveCounter++;
        }
    }

    public void deathCheck() {
        if (healthPoints <= 0) {
            alive = false;
        }
    }
}
